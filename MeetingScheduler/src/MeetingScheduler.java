import EmployeePkg.*;
import MeetingPkg.MeetTime;
import MeetingPkg.Meeting;
import MeetingPkg.MeetingService;
import MeetingPkg.RandomIdGenerator;
import MeetingRoomPkg.MeetingRoom;
import MeetingRoomPkg.MeetingRoomController;
import MeetingRoomPkg.MeetingRoomManager;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MeetingScheduler {
    public static void main(String[] args) {
        EmployeeController employeeController = new EmployeeController();
        MeetingService meetingService = new MeetingService(employeeController);
        MeetingRoomController meetingRoomController = new MeetingRoomController();
        MeetingRoomManager meetingRoomManager = new MeetingRoomManager(meetingRoomController);
        List<Integer> employeeList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            int id = i;
            String name = "staffy" + i;
            String email = "staffy" + i + "@gmail.com";

            Employee employee = new Employee(id,name,email);
            employeeController.addEmployee(employee);
            if(i>10 && i<15){
                employeeList.add(id);
            }
            if(i>30 && i<35){
                employeeList.add(id);
            }
        }

        for (int i = 1; i <= 4; i++) {
            MeetingRoom meetingRoom = new MeetingRoom(RandomIdGenerator.getRandomStringId(),2);
            meetingRoomController.addMeetingRoom(meetingRoom);
        }
        for (int i = 1; i <= 6; i++) {
            MeetingRoom meetingRoom = new MeetingRoom(RandomIdGenerator.getRandomStringId(),4);
            meetingRoomController.addMeetingRoom(meetingRoom);
        }
        for (int i = 1; i <= 1; i++) {
            MeetingRoom meetingRoom = new MeetingRoom(RandomIdGenerator.getRandomStringId(),6);
            meetingRoomController.addMeetingRoom(meetingRoom);
        }

        LocalDateTime start = LocalDateTime.of(2025, 4, 25, 10, 0);
        LocalDateTime end = LocalDateTime.of(2025, 4, 25, 11, 30);
        MeetTime time = new MeetTime(start,end);

        LocalDateTime start1 = LocalDateTime.of(2025, 4, 25, 11, 10);
        LocalDateTime end1 = LocalDateTime.of(2025, 4, 25, 11, 30);
        MeetTime time1 = new MeetTime(start1,end1);

        Meeting meeting = meetingService.createMeeting(20,employeeList,time);

        List<MeetingRoom> availableRooms = meetingRoomManager.getAvailableRooms(5,time);
        meetingRoomManager.bookRoom(meeting, availableRooms.get(0).getRoomId());

        Meeting meeting1 = meetingService.createMeeting(20,employeeList,time1);

        List<MeetingRoom> availableRooms1 = meetingRoomManager.getAvailableRooms(5,time);
        meetingRoomManager.bookRoom(meeting1, availableRooms1.get(0).getRoomId());

    }
}
