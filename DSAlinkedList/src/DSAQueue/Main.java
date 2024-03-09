package DSAQueue;

public class Main {

	public static void main(String[] args) {
	
		Queue queue = new Queue();
		queue.enQueue(5);
		queue.enQueue(2);
		queue.enQueue(4);
		queue.enQueue(7);
		
		queue.deQueue();
		queue.enQueue(3);
		queue.enQueue(8);
		queue.enQueue(3);

		
		System.out.println("size :" + queue.getsize());
		queue.show();
	}

}
