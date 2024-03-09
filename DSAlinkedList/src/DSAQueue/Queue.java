package DSAQueue;

public class Queue {
	
	int queue[] = new int[5];
	int size;
	int front;
	int rear;
	
	// adding elements
	public void enQueue(int data) {
		if(!isFull()) {
		queue[rear] = data;
		rear = (rear+1)%5;
		size = size+1;
		} else {
			System.out.println(" Queued is full  !!");
		}
			
	}
	
	
	// deleting elements
	public int deQueue() {
		
	
		int data = queue[front];
		if(!isEmpty()) {
		front = (front+1)%5;
		size = size-1;
		} else {
			System.out.println("queue is Empty !!");
		}
		return data;
		
	}
	// getting size
	public int getsize() {
		return size;
	}
	
	
	// checking isEmpty
		public boolean isEmpty() {
			return getsize() == 0;
			}
		
	// is full
		public boolean isFull() {
			return getsize()==5;
			
		}
		
		
	
	
	
	// showing elements
	public void show() {
		System.out.println("Elements  :");
		for(int i=0; i<size; i++){
			System.out.print(queue[(front+i)%5] + " ");
		}
	}



	 
}
