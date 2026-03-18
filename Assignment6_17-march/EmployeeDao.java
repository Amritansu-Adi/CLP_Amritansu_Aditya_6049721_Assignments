package cg.demos.springcore_assignment6;


public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee() {}

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }


    public String getName() { return name; }

    
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }



    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}
import java.util.*;
import org.springframework.stereotype.Repository;


@Repository
public class EmployeeDao implements IEmployeeDao {

    private Map<Integer, Employee> empMap = new HashMap<>();

    @Override
    public Employee addEmployee(Employee emp) {
        empMap.put(emp.getId(), emp);
        return emp;
    }

    @Override
    public Employee getEmployeeById(int id) {
        return empMap.get(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(empMap.values());
    }

    @Override
    public Employee updateEmployee(Employee emp) {
        if (empMap.containsKey(emp.getId())) {
            empMap.put(emp.getId(), emp);
            return emp;
        }
        return null;
    }

    @Override
    public boolean deleteEmployee(int id) {
        return empMap.remove(id) != null;
    }
}