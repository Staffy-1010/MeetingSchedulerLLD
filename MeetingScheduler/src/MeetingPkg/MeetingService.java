package MeetingPkg;

import EmployeePkg.*;
import Exceptions.NoSuchEmployeeFoundException;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MeetingService implements IMeetingService {
    EmployeeController employeeController;

    public MeetingService(EmployeeController employeeController){
        this.employeeController = employeeController;
    }

    public Meeting createMeeting(int empId, List<Integer> emps, MeetTime time){

        List<Employee> attendees = new CopyOnWriteArrayList<>();

        for(Integer emp:emps){
            if(employeeController.getEmployee(emp) != null){
                attendees.add(employeeController.getEmployee(emp));
            }
            else{
                throw new NoSuchEmployeeFoundException();
            }
        }

        Employee hostEmployee = employeeController.getEmployee(empId);

        return new Meeting(RandomIdGenerator.getRandomIntegerId(),hostEmployee, attendees,time);

    }
}
