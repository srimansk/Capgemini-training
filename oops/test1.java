package oops;

public class object {

	int add(int... a) {
		int sum = 0;
		for(int i : a) {
			sum += i;
		}
		return sum;
	}
/*	int add(int a, int b, int c) {
		return a + b + c;
	}
	double add(double a, double b) {
		return a + b;
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 test = new Test1();
		System.out.println(test.add(12, 8));
	//	System.out.println(test.add(12.50d, 8.50d));
		System.out.println(test.add(12, 8, 9));
		System.out.println(test.add(12, 8, 9, 8));
	//	Person person = new Person();
		//Person person2 = person;
		Person person = new Person(101, "Ramesh", 29);
		Person p = new Person(102, "Sumesh", 20);
		System.out.println(person.equals(p));
		System.out.println(person);
		
	}
}
//class Person extends Object
class Person{
	int id;
	String name;
	int age;
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return this.getClass().getName() +" [ID "+ id + " Name "
											+ name + " Age "+ age+"]";
	}
	public boolean equals(Object obj) {
		Person p =(Person) obj;
		return p.name == this.name;
	}
}

