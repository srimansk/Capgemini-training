package employeemanagment;
import java.util.*;

public class EmployeeManager {

    List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {

        for (Employee emp : employees) {
            if (emp.getId() == e.getId()) {
                throw new IllegalArgumentException("Employee ID already exists.");
            }
        }

        employees.add(e);
    }

    public Map<String, List<Employee>> groupByDepartment() {

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee e : employees) {

            if (!map.containsKey(e.getDepartment())) {
                map.put(e.getDepartment(), new ArrayList<>());
            }

            map.get(e.getDepartment()).add(e);
        }

        return map;
    }

    public Map<String, Double> averageSalaryByDepartment() {

        Map<String, Double> avgMap = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();

        for (Employee e : employees) {

            String dept = e.getDepartment();

            avgMap.put(dept,
                    avgMap.getOrDefault(dept, 0.0) + e.getSalary());

            countMap.put(dept,
                    countMap.getOrDefault(dept, 0) + 1);
        }

        for (String dept : avgMap.keySet()) {

            avgMap.put(dept,
                    avgMap.get(dept) / countMap.get(dept));
        }

        return avgMap;
    }

    public List<Employee> topNEarners(int n) {

        Collections.sort(employees);

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n && i < employees.size(); i++) {
            list.add(employees.get(i));
        }

        return list;
    }

    public Optional<Employee> findById(int id) {

        for (Employee e : employees) {
            if (e.getId() == id) {
                return Optional.of(e);
            }
        }

        return Optional.empty();
    }
}