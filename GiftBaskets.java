package homework;

public class GiftBaskets {//attributes
	int id;
	String type;
	float Cost;
	
	
	public GiftBaskets() {//default constructors
		id=0;
		type="";
		Cost=0f;
		
	}
	
	public GiftBaskets(int id, String type, float cost) {//primary constructors
		this.id = id;
		this.type = type;
		Cost = cost;
	}
	

	public GiftBaskets(GiftBaskets gift) {//copy constructors
		setId(gift.getId());
		setType(gift.getType());
		setCost(gift.getCost());
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getCost() {
		return Cost;
	}
	public void setCost(float cost) {
		Cost = cost;
	}



	@Override
	public String toString() {//returns constant strings
		return "GiftBaskets [id=" + id + ", type=" + type + ", Cost=" + Cost + "]";
	}

	void display(){
		
		System.out.println(toString());
		
	}



	}

