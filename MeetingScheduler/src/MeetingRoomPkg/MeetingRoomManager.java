package MeetingRoomPkg;

import Exceptions.NoAvailableRoomFoundException;
import MeetingPkg.*;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MeetingRoomManager implements MeetingRoomMan{

    MeetingRoomController meetingRoomController;

    public MeetingRoomManager(MeetingRoomController meetingRoomController){
        this.meetingRoomController = meetingRoomController;
    }

    public void bookRoom(Meeting meeting, String roomId){

        List<MeetingRoom> roomList = meetingRoomController.getMeetingRoomList();

        for (MeetingRoom room : roomList) {

            if (room.getRoomId().equals(roomId)){
                room.addMeeting(meeting);
            }

        }

        System.out.println("Room Booked SuccessFully");

    }


    public List<MeetingRoom> getAvailableRooms(int capacity, MeetTime time) {

        List<MeetingRoom> availableRooms = new CopyOnWriteArrayList<>();

        List<MeetingRoom> roomList = meetingRoomController.getMeetingRoomList();

        for (MeetingRoom room : roomList) {

            if (room.getCapacity() >= capacity) {

                List<Meeting> meetingList = room.getMeetingList();
                boolean isAvailable = true;

                //Logic to find if available or not;
                for(Meeting meeting : meetingList){

                    MeetTime meetTime = meeting.getMeetTime();

                    boolean overlaps = time.getStartDateTime().isBefore(meetTime.getEndDateTime()) &&
                            time.getEndDateTime().isAfter(meetTime.getStartDateTime());

                    if (overlaps) {
                        isAvailable = false;
                    }

                }

                if(isAvailable){
                    availableRooms.add(room);
                }

            }

        }
        if(availableRooms.size() == 0){
            throw new NoAvailableRoomFoundException();
        }
        return availableRooms;

    }
}
