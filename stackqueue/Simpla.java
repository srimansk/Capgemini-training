package stackqueue;

public class Simpla {
	private int[] stack;
	private int top;
	private int capacity;
	
	public Simpla(int size) {
		this.capacity=size;
		this.stack=new int[capacity];
		this.top=-1;
	}
	public void push(int data) {
		if(isfull()) {
			System.out.println(data+"inserted in stack");
			return;
		}
		stack[++top]=data;
		System.out.print(data+"inserted");
	}
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return Stack[top];
	}
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return Stack[top];
		}
	
}
