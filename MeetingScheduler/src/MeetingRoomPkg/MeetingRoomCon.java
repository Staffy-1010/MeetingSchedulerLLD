package MeetingRoomPkg;

import java.util.List;

public interface MeetingRoomCon {
     void addMeetingRoom(MeetingRoom meetingRoom);

     List<MeetingRoom> getMeetingRoomList();

     MeetingRoom getMeetingRoom(String roomId);
}
