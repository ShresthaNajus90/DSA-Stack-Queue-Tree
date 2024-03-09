package DSATree;

class node {
	int data;
	node left;
	node rigth;
	
	public  node(int data) {
		this.data = data;
	}
	
}

public class BinaryTree {
	
	node root;

	public void insert(int data ) {
	 root = insertRec(root, data);
			}
	
	
	public node insertRec(node root, int data) {
		if(root==null) {
			root = new node(data);
			} else if(data<root.data)
				root.left = insertRec(root.left, data);
			else if(data>root.data) {
				root.rigth = insertRec(root.rigth, data);
				}
		return root;
		
	}
	
	// in-Order
	public void inOrder() {
		inOrderRec(root);
	}
	
	public void  inOrderRec(node root){
		if(root != null) {
			
			inOrderRec(root.left);
		
			inOrderRec(root.rigth);
		}
	}
	// pre-order
	public void PreOrder() {
		PreOrderRec(root);
	}
	
	public void  PreOrderRec(node root){
		if(root != null) {
			System.out.print(root.data + " ");
			PreOrderRec(root.left);
						inOrderRec(root.rigth);
		}
	}

}
