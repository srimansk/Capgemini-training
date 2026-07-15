package service;

import Exception.StudentNotFoundException;
import model.Student;
import util.FileUtility;
import java.util.Collections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class Studentservice {
	
	private ArrayList<Student> students = new ArrayList<>();
	
	public void addStudent(Student student) {
		for (Student s : students) {
	        if (s.getId() == student.getId()) {
	            System.out.println("Student ID already exists.");
	            return;
	        }
	    }
	    students.add(student);
	    saveStudents();
	    System.out.println("Student added successfully.");
	}
	
	public void updateStudent(int id, String name, String phone, String address,
            String course, double percentage) throws StudentNotFoundException {
		Student student = searchStudentId(id);
		
		if (name != null && !name.isBlank()) student.setName(name);
		if (phone != null && !phone.isBlank()) student.setPhone(phone);
		if (address != null && !address.isBlank()) student.setAddress(address);
		if (course != null && !course.isBlank()) student.setCourse(course);
		if (percentage >= 0) student.setPercentage(percentage);
		
		saveStudents();
		System.out.println("Student updated successfully!");
	}
	
	public void viewProfile() {
		    if (students.isEmpty()) {
		        System.out.println("No student records found.");
		        return;

		    }
		    System.out.println("==============================================");
		    System.out.println("              STUDENT DETAILS");
		    System.out.println("==============================================");

		    for (Student s : students) {
		        System.out.println(s.toShortString());
		        System.out.println("----------------------------------------------");
		    }
	}
	
	public Student searchStudentId(int id) throws StudentNotFoundException {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        throw new StudentNotFoundException("No student found with ID: " + id);
    }
	public ArrayList<Student> searchStudentName(String name) {
		 ArrayList<Student> results = new ArrayList<>();
	        for (Student s : students) {
	            if (s.getName().toLowerCase().contains(name.toLowerCase())) {
	                results.add(s);
	            }
	        }
	        return results;
	}
	
	public ArrayList<Student> searchStudentCourse(String course) {
		 ArrayList<Student> results = new ArrayList<>();
	        for (Student s : students) {
	            if (s.getCourse().toLowerCase().contains(course.toLowerCase())) {
	                results.add(s);
	            }
	        }
	        return results;
	}
	
	
	public void deleteStudent(int id) throws StudentNotFoundException {
        Student student = searchStudentId(id); 
        students.remove(student);
        saveStudents();
        System.out.println("Student with ID " + id + " deleted successfully!");
    }
	
	public void sortStudentsName() {
		    Collections.sort(students, new Comparator<Student>() {
		        @Override
		        public int compare(Student s1, Student s2) {
		            return s1.getName().compareToIgnoreCase(s2.getName());
		        }
		    });
		    System.out.println("Students sorted by name.");
	}
	
	public void sortStudentsAge() {
	        Collections.sort(students, new Comparator<Student>() {
	            @Override
	            public int compare(Student s1, Student s2) {
	                return s1.getAge() - s2.getAge();
	            }
	        });
	        System.out.println("Students sorted by age.");
	    }
	
	public void sortStudentsPercentage() {
	    Collections.sort(students, new Comparator<Student>() {
	        @Override
	        public int compare(Student s1, Student s2) {
	            if (s1.getPercentage() > s2.getPercentage()) {
	                return -1;
	            } else if (s1.getPercentage() < s2.getPercentage()) {
	                return 1;
	            } else {
	                return 0;
	            }
	        }

	    });

	    System.out.println("Students sorted by percentage (highest first).");
	}
	
	public void sortStudentsId() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getId() - s2.getId();
            }
        });
        System.out.println("Students sorted by Id.");
    }
	
	
	
	public ArrayList<Student> getAllStudents() {
        return students;
    }
}