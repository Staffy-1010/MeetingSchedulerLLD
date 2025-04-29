package EmployeePkg;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EmployeeController implements EmployeeCon{
    Map<Integer,Employee> allEmployees;

    public EmployeeController(){
        allEmployees = new ConcurrentHashMap<>();
    }

    public Employee getEmployee(Integer empId) {
        return allEmployees.get(empId);
    }

    public void addEmployee(Employee employee){
        allEmployees.put(employee.empId,employee);
    }

    public void removeEmployee(int empId){
        allEmployees.remove(empId);
    }

}
