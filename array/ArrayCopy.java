package array;
import java.util.Arrays;
public class ArrayCopy {
	    public static void main(String[] args) {
	        int[] original = {1, 2, 3, 4, 5};

	        int[] copy1 = Arrays.copyOf(original, original.length);

	        int[] copy2 = new int[original.length];
	        System.arraycopy(original, 0, copy2, 0, original.length);

	        copy1[0] = 99;
	        copy2[3] = 34;

	        System.out.println("Original: " + Arrays.toString(original));
	        System.out.println("Copy:1 " + Arrays.toString(copy1));    
	        System.out.println("Copy:2 " + Arrays.toString(copy2)); 
	 }
}
