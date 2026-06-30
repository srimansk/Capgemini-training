package MapSetList;

public class Student {


	    int rollNo;
	    String name;
	    int marks;
	    String department;

	    public Student(int rollNo, String name, int marks, String department) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.marks = marks;
	        this.department = department;
	    }

	    public void display() {
	        System.out.println(rollNo + "  " + name + "  " + marks + "  " + department);
	    }
	}

