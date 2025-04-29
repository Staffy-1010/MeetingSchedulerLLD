package MeetingPkg;

import java.util.List;

public interface IMeetingService {

    Meeting createMeeting(int empId, List<Integer> emps, MeetTime time);

}
