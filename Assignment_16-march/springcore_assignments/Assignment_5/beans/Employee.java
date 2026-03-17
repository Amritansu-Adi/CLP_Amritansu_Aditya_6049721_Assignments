package cg.demos.springcore_assignments.beans;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private String businessUnit;
	private int age;
    private SBU sbu;
	
    public Employee(int employeeId, String employeeName, double salary, String businessUnit, int age) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age = age;
		
	}

    public SBU getSbu() {
		return sbu;
	}
	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}
	
	public void displayDetails() {
		System.out.println("Employee Details");
		System.out.println("----------------------");
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee Salary: " + salary);
		System.out.println("Employee BU: " + businessUnit);
		System.out.println("Employee Age: " + age);
		
	}

    }