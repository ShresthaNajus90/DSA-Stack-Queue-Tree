package DSATree;

public class Main {

	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
		
		bt.insert(8);
		bt.insert(2);
		bt.insert(7);
		bt.insert(5);
		bt.insert(7);
		bt.insert(9);
		
		bt.inOrder();
	//	bt.PreOrder();

	}

}
