package homework;

public class LinkedList {
	Node Head;

	public LinkedList(Node head) {
		
		Head = null;
	}


	public LinkedList() {
		
	}

	boolean isEmpty() {//isEmpty function if head is null or not
		
		if(Head==null) {
			
			return true;
		}
		else {
			
			return false;
		}
		
}
	
	public boolean isFull() {//isFull function for new Node
		
		Node temp=new Node();
		if(temp==null) {
			return true;
			
		}else {
			
			temp= null;
			return false;
		}
		
		
}


	public void display() {
		// TODO Auto-generated method stub
		
	}


	public void addToEnd(GiftBaskets fruits) {
		// TODO Auto-generated method stub
		
	}
	
}
