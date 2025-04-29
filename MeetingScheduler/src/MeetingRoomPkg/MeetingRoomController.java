package MeetingRoomPkg;

import Exceptions.NoSuchRoomFoundException;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MeetingRoomController implements MeetingRoomCon{
    List<MeetingRoom> meetingRoomList;

    public MeetingRoomController(){
        meetingRoomList = new CopyOnWriteArrayList<>();
    }

    public void addMeetingRoom(MeetingRoom meetingRoom){
        meetingRoomList.add(meetingRoom);
    }

    public List<MeetingRoom> getMeetingRoomList() {
        return meetingRoomList;
    }

    public MeetingRoom getMeetingRoom(String roomId){
        for (MeetingRoom meetingRoom: meetingRoomList){
            if(meetingRoom.getRoomId().equals(roomId)){
                return meetingRoom;
            }
        }
        throw new NoSuchRoomFoundException();
    }
}
