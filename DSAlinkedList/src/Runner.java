

public class Runner {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(12);
		list.insert(23);
		list.insert(11);
		list.insertAtStart(9);
		list.insertAtAnyLoaction(0, 13);
		
		list.deleteAt(1);
		list.show();
	}

}
