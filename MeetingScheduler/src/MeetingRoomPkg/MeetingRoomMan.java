package MeetingRoomPkg;

import MeetingPkg.MeetTime;
import MeetingPkg.Meeting;

import java.util.List;

public interface MeetingRoomMan {
     void bookRoom(Meeting meeting, String roomId);

     List<MeetingRoom> getAvailableRooms(int capacity, MeetTime time);

}
