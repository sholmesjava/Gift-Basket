package homework;

public class Node {
	GiftBaskets data;
	Node next;

	public Node(GiftBaskets data, Node next) {
		
		this.data = data;
		this.next = next;
	}

	public Node() {
		super();
		data = new GiftBaskets();
		next = null;
	}


	public GiftBaskets getData() {
		return data;
	}

	public void setData(GiftBaskets data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
