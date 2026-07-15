package api;
import java.util.*;
public class even {
	    public static void main(String[] args) {

	        List<Integer> numbers = Arrays.asList(2, 5, 8, 11, 14, 17);

	        numbers.stream()
	               .filter(n -> n % 2 == 0)
	               .forEach(n -> System.out.print(n + " "));
	    }
	}

