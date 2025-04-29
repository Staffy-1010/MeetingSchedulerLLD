package EmployeePkg;

public class Employee {
    int empId;
    String name;
    String emailId;

    public Employee(int empId, String name, String emailId) {
        this.name = name;
        this.emailId = emailId;
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
