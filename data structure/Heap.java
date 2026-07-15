package datastru;
import java.util.PriorityQueue;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " : " + marks;
    }
}

public class Heap {
    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>((a, b) -> b.marks - a.marks);

        pq.add(new Student("Ram", 85));
        pq.add(new Student("Sam", 92));
        pq.add(new Student("Barathi", 78));
        pq.add(new Student("Kala", 95));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
