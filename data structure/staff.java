package datastru;

import java.util.PriorityQueue;

class Staff {

    int id;
    String name;
    double salary;
    String dept;

    public Staff(int id, String name, double salary, String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Staff [id=" + id + ", name=" + name +
                ", salary=" + salary + ", dept=" + dept + "]";
    }
}

public class staff {

    public static void main(String[] args) {

        PriorityQueue<Staff> pq = new PriorityQueue<>((x, y) -> Double.compare(y.salary, x.salary));

        pq.add(new Staff(101, "Gokul", 5000, "QA"));
        pq.add(new Staff(102, "Seaker", 6500, "Developer"));
        pq.add(new Staff(103, "Viswa", 7000, "HR"));
        pq.add(new Staff(104, "Pulli", 6000, "Testing"));

        System.out.println("Staff in Priority Queue:");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}