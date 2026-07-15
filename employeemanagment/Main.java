package employeemanagment;

public class Main {

    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(new Employee(101, "jil", "IT", 70000));
        manager.addEmployee(new Employee(102, "jung", "HR", 50000));
        manager.addEmployee(new Employee(103, "juck", "IT", 90000));
        manager.addEmployee(new Employee(104, "jajak", "Finance", 80000));
        manager.addEmployee(new Employee(105, "Kajak", "HR", 60000));
        System.out.println("Employees");
        System.out.println(manager.topNEarners(5));
        System.out.println("Group By Department");
        System.out.println(manager.groupByDepartment());
        System.out.println("Average Salary");
        System.out.println(manager.averageSalaryByDepartment());
        System.out.println("Top 3 Earners");
        System.out.println(manager.topNEarners(3));
        System.out.println("Find Employee ID 103");
        System.out.println(manager.findById(103));
    }
}