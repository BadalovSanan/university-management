package model.person;

import java.time.LocalDate;

public abstract class Employee extends Person {  
    protected String employeeId;
    protected String department;
    protected String position;
    protected double salary;
    protected LocalDate hireDate;
    protected String contractType;
    protected int yearsOfExperience;
    protected String workSchedule;
    protected boolean isFullTime;
    protected String[] responsibilities;

    public Employee(int id, String fullName, String address, String phone, String email, LocalDate dateOfBirth, 
                    LocalDate hireDate, String employeeId, String department, String position, 
                    double salary, String contractType, int yearsOfExperience, 
                    String workSchedule, String[] responsibilities) {
        super(id, fullName, address, phone, email, dateOfBirth);
        this.employeeId = employeeId;
        this.department = department;
        this.position = position;
        this.salary = salary;
        this.hireDate = hireDate;
        this.contractType = contractType;
        this.yearsOfExperience = yearsOfExperience;
        this.workSchedule = workSchedule;
        this.responsibilities = responsibilities;
    }

    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public LocalDate getHireDate() { return hireDate; }

    public double calculateAnnualSalary() { return salary * 12; }

    public void assignTask(String task) { System.out.println(super.fullName + " has been assigned: " + task); }

    public void completeTask(String task) { System.out.println(super.fullName + " completed: " + task); }

    public void increaseExperience() { yearsOfExperience++; }

    public void promote(String newPosition, double newSalary) { 
        this.position = newPosition; 
        this.salary = newSalary; 
        System.out.println(super.fullName + " got promoted to " + position); 
}

    public void displayEmployeeDetails() {
        System.out.println("Name: " + super.fullName);
        System.out.println("ID: " + employeeId);
        System.out.println("Position: " + position);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
        System.out.println("Hire Date: " + hireDate);
}

    }
}
