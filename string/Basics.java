package string;


public class Basics {
	    public static void main(String[] args) {

	        String s = "  Java,Python,SQL  ";
	        String s1 = "Java";
	        String s2 = "java";

	        // length()
	        System.out.println("Length = " + s.length());         
	        // Output: Length = 19

	        // trim()
	        s = s.trim();
	        System.out.println("Trim = " + s);                   
	        // Output: Trim = Java,Python,SQL

	        // charAt()
	        System.out.println("charAt(2) = " + s.charAt(2));    
	        // Output: charAt(2) = v

	        // indexOf()
	        System.out.println("indexOf(a) = " + s.indexOf("a"));
	        // Output: indexOf(a) = 1

	        // lastIndexOf()
	        System.out.println("lastIndexOf(a) = " + s.lastIndexOf("a"));
	        // Output: lastIndexOf(a) = 3

	        // substring()
	        System.out.println("substring(0,4) = " + s.substring(0, 4));
	        // Output: substring(0,4) = Java

	        // replace()
	        System.out.println("replace = " + s.replace("Java", "C"));
	        // Output: replace = C,Python,SQL

	        // equals()
	        System.out.println("equals = " + s1.equals(s2));
	        // Output: equals = false

	        // equalsIgnoreCase()
	        System.out.println("equalsIgnoreCase = " + s1.equalsIgnoreCase(s2));
	        // Output: equalsIgnoreCase = true

	        // compareTo()
	        System.out.println("compareTo = " + s1.compareTo(s2));
	        // Output: compareTo = -32

	        // startsWith()
	        System.out.println("startsWith = " + s.startsWith("Java"));
	        // Output: startsWith = true

	        // contains()
	        System.out.println("contains = " + s.contains("Python"));
	        // Output: contains = true

	        // matches()
	        String num = "12345";
	        System.out.println("matches = " + num.matches("\\d+"));
	        // Output: matches = true

	        // split()
	        String[] arr = s.split(",");

	        System.out.println("Split Output:");
	        for(int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	        }

	        // Output:
	        // Java
	        // Python
	        // SQL

	        // join()
	        String joined = String.join("-", arr);
	        System.out.println("Join = " + joined);
	        // Output: Join = Java-Python-SQL

	        // toCharArray()
	        char[] ch = s1.toCharArray();

	        System.out.println("toCharArray Output:");
	        for(int i = 0; i < ch.length; i++) {
	            System.out.print(ch[i] + " ");
	        }

	        // Output:
	        // J a v a

	        System.out.println();

	        // StringBuffer
	        StringBuffer sbf = new StringBuffer("Java");
	        sbf.append(" Programming");
	        System.out.println("StringBuffer = " + sbf);
	        // Output: StringBuffer = Java Programming

	        // StringBuilder
	        StringBuilder sbd = new StringBuilder("Java");
	        sbd.append(" SQL");
	        sbd.reverse();
	        System.out.println("StringBuilder = " + sbd);
	        // Output: StringBuilder = LQS avaJ
	    }
	}

