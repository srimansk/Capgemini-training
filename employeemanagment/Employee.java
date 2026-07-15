package employeemanagment;

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        return this.id == e.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public int compareTo(Employee e) {
        if (this.salary > e.salary)
            return -1;
        else if (this.salary < e.salary)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}