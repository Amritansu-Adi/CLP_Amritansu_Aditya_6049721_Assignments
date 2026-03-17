package cg.demos.springcore_assignments.beans;
import java.util.*;

public class SBU {
	private int sbuId;
	private String sbuName;
	private String sbuHead;
	private List<Employee> empList;
	
    public SBU(int sbuId, String sbuName, String sbuHead) {
		super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}
    
    public String getSbuDetails() {
		return "SBU Details\n ---------------------- \n SBU ID:" + sbuId + "\n SBU Name: " + sbuName + "\n SBU Head: " + sbuHead;
	}
	public void displaySbuDetails() {
		System.out.println("SBU Details");
		System.out.println("----------------------");
		System.out.println("SBU ID: " + sbuId);
		System.out.println("SBU Name: " + sbuName);
		System.out.println("SBU Head: " + sbuHead);
		
		System.out.println("\nList of Employees in this SBU:");
		for(Employee emp : empList) {
			
			System.out.println("\nEmployee ID:" + emp.getEmployeeId());
			System.out.println("Employee Name:" + emp.getEmployeeName());
			System.out.println("Employee Salary:" + emp.getSalary());
			System.out.println("Employee BU:" + emp.getBusinessUnit());
			System.out.println("Employee Age:" + emp.getAge());
			
		}
	}
}