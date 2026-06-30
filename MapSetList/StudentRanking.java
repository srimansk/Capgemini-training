package MapSetList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class StudentRanking {

	    public static void main(String[] args) {

	        ArrayList<Student> list = new ArrayList<>();

	        list.add(new Student(101, "Rahul", 92, "CSE"));
	        list.add(new Student(102, "Anjali", 85, "ECE"));
	        list.add(new Student(103, "Kiran", 78, "CSE"));
	        list.add(new Student(104, "Suresh", 96, "EEE"));
	        list.add(new Student(105, "Priya", 88, "ECE"));
	        list.add(new Student(106, "Arun", 81, "CSE"));
	        list.add(new Student(107, "Divya", 99, "IT"));
	        list.add(new Student(108, "Bala", 75, "IT"));

	        // Sort by Highest Marks
	        Collections.sort(list, new Comparator<Student>() {
	            public int compare(Student s1, Student s2) {
	                return s2.marks - s1.marks;
	            }
	        });

	        System.out.println("Students Sorted by Marks");
	        for (Student s : list) {
	            s.display();
	        }

	        // Sort by Name
	        Collections.sort(list, new Comparator<Student>() {
	            public int compare(Student s1, Student s2) {
	                return s1.name.compareTo(s2.name);
	            }
	        });

	        System.out.println("\nStudents Sorted by Name");
	        for (Student s : list) {
	            s.display();
	        }

	        // Sort by Roll Number
	        Collections.sort(list, new Comparator<Student>() {
	            public int compare(Student s1, Student s2) {
	                return s1.rollNo - s2.rollNo;
	            }
	        });

	        System.out.println("\nStudents Sorted by Roll Number");
	        for (Student s : list) {
	            s.display();
	        }

	        // Display Top 5 Students
	        Collections.sort(list, new Comparator<Student>() {
	            public int compare(Student s1, Student s2) {
	                return s2.marks - s1.marks;
	            }
	        });

	        System.out.println("\nTop 5 Students");

	        for (int i = 0; i < 5 && i < list.size(); i++) {
	            list.get(i).display();
	        }

	        // Department Wise Topper
	        HashMap<String, Student> topper = new HashMap<>();

	        for (Student s : list) {

	            if (!topper.containsKey(s.department)) {
	                topper.put(s.department, s);
	            } else {

	                Student temp = topper.get(s.department);

	                if (s.marks > temp.marks) {
	                    topper.put(s.department, s);
	                }
	            }
	        }

	        System.out.println("\nDepartment Wise Toppers");

	        for (String dept : topper.keySet()) {
	            System.out.print(dept + " -> ");
	            topper.get(dept).display();
	        }

	        // Count students above 80%
	        int count = 0;

	        for (Student s : list) {
	            if (s.marks > 80) {
	                count++;
	            }
	        }

	        System.out.println("\nStudents scoring above 80% = " + count);
	    }
	}
