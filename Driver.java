package homework;

public class Driver {

	public static void main(String[] args) {
		LinkedList List=new LinkedList();
		System.out.println("Adding gifts");
		GiftBaskets Fruits= new GiftBaskets(1,"fruits",700f);
		GiftBaskets Flowers= new GiftBaskets(2,"flowers",550f);
		GiftBaskets Rings= new GiftBaskets(3,"wedding rings",6000f);
		
		List.addToEnd(Fruits);
		List.addToEnd(Flowers);
		List.addToEnd(Rings);
		
		
		List.display();
	}

}
