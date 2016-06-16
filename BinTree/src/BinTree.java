
public class BinTree {

	
	
	
	
	Node root;
	
	public BinTree(Node root){
		this.root = root;

	}
	
	
	public Node search(String value){
		
		Node start = this.root;
		
		while(start.value != null && start.value != value){

			if(start.value.compareTo(value)>0){
				
				if(start.hasLeftChild()){
					start = start.leftChild;
				}else{
					break;
				}
				
				
			}else{
				
				if(start.hasRightChild()){
					start = start.rightChild;
				}else{
					break;
				}
				
			}

		}
		
		if(start.value.equals(value)){
			return start;
		}else{
			return null;
		}
		
		
	}
	
	
	
	
	public void insert(Node node){
		
		
		if(this.search(node.value)!=null){
			System.out.println("ERROR - duplicate value!");
		}else{
			
			Node start = this.root;
			
			
			
			
			
			
			
			//richtige Stelle finden
			
			

		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
