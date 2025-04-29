package Exceptions;

import MeetingPkg.Meeting;
import MeetingRoomPkg.MeetingRoom;
import MeetingRoomPkg.MeetingRoomController;

import java.util.List;

public class NoSuchRoomFoundException extends RuntimeException{
    public class RoomManager {

        MeetingRoomController meetingRoomController;

        RoomManager() {
            meetingRoomController = new MeetingRoomController();
        }

        public void bookRoom(Meeting meeting, String roomId) {

            List<MeetingRoom> roomList = meetingRoomController.getMeetingRoomList();

                for(MeetingRoom room: roomList) {
                    if(room.getRoomId().equals(roomId)) {
                        room.addMeeting(meeting);
                    }
                }

            }

        }
}
