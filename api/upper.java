package api;
import java.util.*;
import java.util.stream.Collectors;
public class upper {

	    public static void main(String[] args) {

	        List<String> names = Arrays.asList("john", "alice", "bob");

	        List<String> upperCaseNames = names.stream()
	                .map(name -> name.toUpperCase())
	                .collect(Collectors.toList());

	        System.out.println(upperCaseNames);
	    }
	}

