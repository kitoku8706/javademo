package ncs.test04;

public class Product {
	String name;
	int price;
	int quantity;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String information() {
		String.format(getName(), getPrice(), getQuantity());
		
		return null;
	}
}// end class