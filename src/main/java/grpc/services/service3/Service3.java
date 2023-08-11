package grpc.services.service3;

import java.io.IOException;
import java.net.InetAddress;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import grpc.services.schedule.Schedule;
import grpc.services.service3.StaffAvailabilityGrpc.StaffAvailabilityImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class Service3 extends StaffAvailabilityImplBase {
	static int port = 3032;

	private List<Schedule> schedules = new ArrayList<>();

	public Service3() {
		// Add some schedules in advance to the schedules list 
		schedules.add(Schedule.newBuilder().setName("john").setPosition("floor-staff").setDate("2023-08-01")
				.setStartTime("09:00").setEndTime("17:00").build());
		schedules.add(Schedule.newBuilder().setName("jane").setPosition("manager").setDate("2023-08-01")
				.setStartTime("10:00").setEndTime("18:00").build());
		schedules.add(Schedule.newBuilder().setName("bob").setPosition("cashier").setDate("2023-08-01")
				.setStartTime("11:00").setEndTime("16:00").build());
		schedules.add(Schedule.newBuilder().setName("john").setPosition("floor-staff").setDate("2023-08-02")
				.setStartTime("09:00").setEndTime("17:00").build());
		schedules.add(Schedule.newBuilder().setName("jane").setPosition("manager").setDate("2023-08-02")
				.setStartTime("10:00").setEndTime("18:00").build());
		schedules.add(Schedule.newBuilder().setName("bob").setPosition("cashier").setDate("2023-08-02")
				.setStartTime("11:00").setEndTime("16:00").build());
		schedules.add(Schedule.newBuilder().setName("john").setPosition("floor-staff").setDate("2023-08-03")
				.setStartTime("09:00").setEndTime("17:00").build());
		schedules.add(Schedule.newBuilder().setName("jane").setPosition("manager").setDate("2023-08-03")
				.setStartTime("10:00").setEndTime("18:00").build());
		schedules.add(Schedule.newBuilder().setName("bob").setPosition("cashier").setDate("2023-08-03")
				.setStartTime("11:00").setEndTime("16:00").build());
		schedules.add(Schedule.newBuilder().setName("john").setPosition("floor-staff").setDate("2023-08-04")
				.setStartTime("09:00").setEndTime("17:00").build());
		schedules.add(Schedule.newBuilder().setName("jane").setPosition("manager").setDate("2023-08-04")
				.setStartTime("10:00").setEndTime("18:00").build());
		schedules.add(Schedule.newBuilder().setName("bob").setPosition("cashier").setDate("2023-08-04")
				.setStartTime("11:00").setEndTime("16:00").build());
		schedules.add(Schedule.newBuilder().setName("john").setPosition("floor-staff").setDate("2023-08-05")
				.setStartTime("09:00").setEndTime("17:00").build());
		schedules.add(Schedule.newBuilder().setName("jane").setPosition("manager").setDate("2023-08-05")
				.setStartTime("10:00").setEndTime("18:00").build());
		schedules.add(Schedule.newBuilder().setName("bob").setPosition("cashier").setDate("2023-08-05")
				.setStartTime("11:00").setEndTime("16:00").build());
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		Service3 service3 = new Service3();

		Server server;
		try {
			server = ServerBuilder.forPort(port).addService(service3).build().start();
			System.out.println("Server started....");
			testJMDNS();
			server.awaitTermination();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Override
	public StreamObserver<AvailabilityRequest> checkAvailability(
			StreamObserver<AvailabilityResponse> responseObserver) {
		return new StreamObserver<AvailabilityRequest>() {
			@Override
			public void onNext(AvailabilityRequest request) {
				String name = request.getName();
				String position = request.getPosition();
				String startDate = request.getStartDate();
				String endDate = request.getEndDate();

				int workingHours = 0;
				Schedule staffSchedule = null;

				for (Schedule s : schedules) {
					if (s.getName().equals(name) && s.getPosition().equals(position)
							&& isScheduleWithinDateRange(s, startDate, endDate)) {
						staffSchedule = s;
						workingHours += calculateWorkingHours(s);
					}
				}

				boolean isAvailable = staffSchedule == null || workingHours < 40; // Update condition for isAvailable
				AvailabilityResponse response = AvailabilityResponse.newBuilder().setIsAvailable(isAvailable)
						.setWorkingHours(workingHours).setSchedule(staffSchedule).build();

				responseObserver.onNext(response);
			}

			@Override
			public void onError(Throwable t) {
				System.err.println("Error in checkAvailability: " + t);
			}

			@Override
			public void onCompleted() {
				responseObserver.onCompleted();
			}
		};
	}

	@Override
	public StreamObserver<UpdateRequest> updateSchedule(StreamObserver<UpdateResponse> responseObserver) {
		return new StreamObserver<UpdateRequest>() {
			@Override
			public void onNext(UpdateRequest request) {
				Schedule staffSchedule = request.getStaffSchedule();
				boolean isUpdated = false;
				boolean isDuplicate = false;

				for (int i = 0; i < schedules.size(); i++) {
					Schedule s = schedules.get(i);
					if (s.getName().equals(staffSchedule.getName())
							&& s.getPosition().equals(staffSchedule.getPosition())
							&& s.getDate().equals(staffSchedule.getDate())) {

						isDuplicate = true;
						break;
					}
				}

				if (isDuplicate) {
					// Display error message
					UpdateResponse errorResponse = UpdateResponse.newBuilder().setIsUpdated(false).build();
					responseObserver.onNext(errorResponse);
				} else {
					schedules.add(staffSchedule);
					isUpdated = true;
				}

				UpdateResponse response = UpdateResponse.newBuilder().setIsUpdated(isUpdated)
						.setStaffSchedule(staffSchedule).build();

				responseObserver.onNext(response);
				responseObserver.onCompleted();
			}

			@Override
			public void onError(Throwable t) {
				// Handle the error, e.g., log the error or send an error response
				System.err.println("Error in updateSchedule: " + t);
				responseObserver.onError(t);
			}

			@Override
			public void onCompleted() {
				responseObserver.onCompleted();
			}
		};
	}

	private int calculateWorkingHours(Schedule schedule) {
		LocalTime startTime = LocalTime.parse(schedule.getStartTime());
		LocalTime endTime = LocalTime.parse(schedule.getEndTime());
		int workingHours = (int) ChronoUnit.HOURS.between(startTime, endTime);
		return workingHours;
	}

	private boolean isScheduleWithinDateRange(Schedule schedule, String startDate, String endDate) {
		LocalDate scheduleDate = LocalDate.parse(schedule.getDate());
		LocalDate start = LocalDate.parse(startDate);
		LocalDate end = LocalDate.parse(endDate);

		return (scheduleDate.isEqual(start) || scheduleDate.isAfter(start))
				&& (scheduleDate.isEqual(end) || scheduleDate.isBefore(end));
	}

	public static void testJMDNS() {
		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

			// Register a service
			ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "grpc", port, "path=index.html");
			jmdns.registerService(serviceInfo);

			// Wait a bit
			Thread.sleep(20000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}