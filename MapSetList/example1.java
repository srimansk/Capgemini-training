package MapSetList;
import java.util.*;
public class example1 {
		String name;
		int marks;
		int roll_no;
		String department;
		
		example1(String name,int marks,int roll_no,String department){
			this.name = name;
			this.marks = marks;
			this.roll_no = roll_no;
			this.department = department;
		}
		public class Main{
			public static void main(String[]args) {
			Scanner scan = new Scanner(System.in);
			List<example1> list = new ArrayList <>(); 
			list.add(new example1("Arun", 95, 101, "CSE"));
			list.add(new example1( "Ravi", 90, 102, "IT"));
			list.add(new example1("Bala", 95, 103,  "CSE"));
			list.add(new example1( "Kiran", 85, 104, "ECE"));
			list.add(new example1( "Ajay", 90, 105, "IT"));
			list.add(new example1( "Deepak", 99, 106,  "ECE"));
			/*
			int n = scan.nextInt();
			
			for(int i=0;i<n;i++) {
				String name = scan.next();
				int marks = scan.nextInt();
				int roll_no = scan.nextInt();
				String department = scan.next();
				
				list.add(new Student(name,marks,roll_no)); 
			}
			*/
			Collections.sort(list, new Comparator<example1>() {

			    @Override
			    public int compare(example1 s1, example1 s2) {
			        if (s1.marks != s2.marks)
			            return s2.marks - s1.marks;
			        if (!s1.name.equals(s2.name))
			            return s1.name.compareTo(s2.name);
			        return s1.roll_no - s2.roll_no;
			    }
			});
			System.out.println("Toppers 5: ");
			for (int i = 0; i < 5 && i < list.size(); i++) {
				example1 s = list.get(i);

			    System.out.println(s.roll_no + " "+ s.name + " " + s.marks + " "+ s.department);
			}
			int count = 0;
			for (example1 s : list) {
			    if (s.marks > 80)
			        count++;
			}
			System.out.println("Students above 80 : "+count);
		}
			
	}

	}

