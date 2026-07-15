package api;
import java.util.*;
import java.util.stream.Collectors;
public class square {

	    public static void main(String[] args) {

	        List<Integer> numbers = Arrays.asList(2, 3, 4);

	        List<Integer> squares = numbers.stream()
	                .map(n -> n * n)
	                .collect(Collectors.toList());

	        System.out.println(squares);
	    }
	}

