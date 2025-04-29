package MeetingRoomPkg;

import MeetingPkg.Meeting;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MeetingRoom {
    String roomId;
    int capacity;
    List<Meeting> meetingList;

    public MeetingRoom(String roomId, int capacity){
        this.roomId = roomId;
        this.capacity = capacity;
        meetingList = new CopyOnWriteArrayList<>();
    }

    public String getRoomId() {
        return roomId;
    }

    public void addMeeting(Meeting meeting) {
        meetingList.add(meeting);
        System.out.println("Meeting added");
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Meeting> getMeetingList() {
        return meetingList;
    }

    public void setMeetingList(List<Meeting> meetingList) {
        this.meetingList = meetingList;
    }
}
