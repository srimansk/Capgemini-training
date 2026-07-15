package datastru;

import java.util.PriorityQueue;

public class pq {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(50);
        pq.add(20);
        pq.add(70);
        pq.add(10);
        pq.add(40);
        pq.add(60);
        pq.add(30);

        // Display queue
        System.out.println("Priority Queue: " + pq);

        // Peek (smallest element)
        System.out.println("Peek: " + pq.peek());

        // Remove smallest element
        System.out.println("Poll: " + pq.poll());

        // Queue after poll
        System.out.println("After Poll: " + pq);

        // Remove a specific element
        pq.remove(40);
        System.out.println("After Removing 40: " + pq);

        // Check if element exists
        System.out.println("Contains 70: " + pq.contains(70));

        // Size
        System.out.println("Size: " + pq.size());

        // Is Empty
        System.out.println("Is Empty: " + pq.isEmpty());

        // Iterate
        System.out.print("Elements: ");
        for (Integer i : pq) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Remove all elements in sorted order
        System.out.println("\nRemoving elements:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}