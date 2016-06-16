
public class BinTreeDriver {

	
	public static void main(String[] args) {
		
		Node root = new Node("6");
		
		Node one = new Node(root,"3");
		Node two = new Node(root,"9");
		
		root.setLeftChild(one);
		root.setRightChild(two);

		
		Node three = new Node(one,"1");
		Node four = new Node(one,"5");
		
		one.setLeftChild(three);
		one.setRightChild(four);
		
		
		Node five = new Node(two,"7");
		two.setLeftChild(five);
		
		BinTree test = new BinTree(root);
		
		
		test.insert(new Node("8"));
		
		System.out.println("inserterd");
		
//		Node result = test.search("7");
//		
//		if(result!=null){
//			System.out.println("Value "+result.value + " found!");
//		}else{
//			System.out.println("ERROR value not found!");
//		}
//		
		
		
	}
	
	
	

	
	
	
	
}
