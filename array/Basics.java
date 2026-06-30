package array;

public class Basics {
	public static void main(String[] args) {
	String[] traineeNames = {"Gokul", "Hari", "Sriman",};

	for (String name : traineeNames) {
	    System.out.println("Trainee Name: " + name);
	    
	    if (name.equals("Sriman")) {
	        System.out.println("Found the star trainee: Sriman!");
	    }
	  }
    }
  }
