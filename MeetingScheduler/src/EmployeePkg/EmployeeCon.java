package EmployeePkg;

public interface EmployeeCon {
     Employee getEmployee(Integer empId);

     void addEmployee(Employee employee);

     void removeEmployee(int empId);
}
