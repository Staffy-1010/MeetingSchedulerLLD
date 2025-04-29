package MeetingPkg;

import java.time.LocalDateTime;

public class MeetTime {
    LocalDateTime startDateTime;
    LocalDateTime endDateTime;

    public MeetTime(LocalDateTime startDateTime, LocalDateTime endDateTime){
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }
}
