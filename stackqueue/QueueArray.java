package stackqueue;

public class QueueArray {

    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    // Constructor
    public QueueArray(int size) {
        capacity = size;
        queue = new int[capacity];
        front = 0;
        rear = -1;
    }

    // Check if queue is full
    public boolean isFull() {
        return rear == capacity - 1;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front > rear;
    }

    // Enqueue (Insert)
    public void enqueue(int data) {

        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        queue[++rear] = data;
        System.out.println(data + " inserted into queue");
    }

    // Dequeue (Remove)
    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        return queue[front++];
    }

    // Peek (Front Element)
    public int peek() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return queue[front];
    }

    // Display Queue
    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {

        QueueArray q = new QueueArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Queue Elements:");
        q.display();

        System.out.println("Front Element: " + q.peek());

        System.out.println("Removed Element: " + q.dequeue());

        System.out.println("Queue After Dequeue:");
        q.display();
    }
}