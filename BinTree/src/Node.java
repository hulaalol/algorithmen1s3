
public class Node {

	Node root;
	String value;
	Node leftChild;
	Node rightChild;
	
	int level;
	
	
	public Node(Node root, String value, Node leftChild, Node rightChild) {
		super();
		this.root = root;
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	
	public Node(Node root,String value){
		super();
		this.root = root;
		this.value = value;
	}
	
	public Node(String value){
		super();
		this.value = value;
	}


	public void setRoot(Node root) {
		this.root = root;
	}


	public void setLeftChild(Node leftChild) {
		
		if(this.value.compareTo(leftChild.value) > 0){
			this.leftChild = leftChild;
		}else{
			System.err.println("ERROR: leftChild is greater than parent!");
		}
	
	}

	public void setRightChild(Node rightChild) {
		
		if(this.value.compareTo(rightChild.value) < 0){
			this.rightChild = rightChild;
		}else{
			System.err.println("ERROR: rightChild is greater than parent!");
		}
	}
	
	
	public boolean hasLeftChild(){
		if (this.leftChild != null){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean hasRightChild(){
		if (this.rightChild != null){
			return true;
		}else{
			return false;
		}
	}
	
	
	
	public Node[] getChilds(BinTree tree){
		Node[] res = new Node[2];
		res[0] = tree.root.leftChild;
		res[1] = tree.root.rightChild;
		return res;
		
	}

}
