package oops;

class Employee{
	int id;
	String name;
	Employee(){
	id = 100;
	name="roshan";
	}
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	public String getDetails() {
		return "Id"+ id + " Name "+ name;
	}
	
}
class Manager extends Employee{
	String dept;
	Manager(){
		super();
	dept = "Hr";
	}
	Manager(int id, String name, String dept){
		super(id, name);
		this.dept = dept;
	}
	public String getDetails() {
		return super.getDetails() + " Dept "+ dept;
	}	
}
class Test{
public static void main(String[] args){
Manager manager = new Manager(100, "rakesh", "Sales");
//System.out.println(manager.id +"\t"+ manager.name+"\t"+ manager.dept);
System.out.println(manager.getDetails());
}
}