package MeetingPkg;

import EmployeePkg.*;

import java.util.List;

public class Meeting {
    int meetingId;
    Employee host;
    List<Employee> attendees;

    public Meeting(int meetingId, Employee host, List<Employee> attendees, MeetTime meetTime) {
        this.meetingId = meetingId;
        this.host = host;
        this.attendees = attendees;
        this.meetTime = meetTime;
    }

    MeetTime meetTime;

    public int getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(int meetingId) {
        this.meetingId = meetingId;
    }

    public Employee getHost() {
        return host;
    }

    public void setHost(Employee host) {
        this.host = host;
    }

    public MeetTime getMeetTime() {
        return meetTime;
    }

    public void setMeetTime(MeetTime meetTime) {
        this.meetTime = meetTime;
    }
}
