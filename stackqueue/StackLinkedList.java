package stackqueue;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class StackLinkedList {
    Node top;

    // Push
    public void push(int data) {

        Node newNode = new Node(data);

        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }

        System.out.println(data + " inserted into stack");
    }

    // Pop
    public int pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = top.data;
        top = top.next;

        return value;
    }

    // Peek
    public int peek() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return top.data;
    }

    // isEmpty
    public boolean isEmpty() {
        return top == null;
    }

    // Display
    public void display() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {

        StackLinkedList s = new StackLinkedList();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack Elements:");
        s.display();
        System.out.println("Top Element: " + s.peek());
        System.out.println("Removed Element: " + s.pop());
        System.out.println("Stack After Pop:");
        s.display();
    }
}
