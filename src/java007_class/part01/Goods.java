package java007_class.part01;

public class Goods {
	String name; //상품명
	int price; //가격
	int numberOfStock; //상품재고
	int sold; //팔린수량
	
	public Goods() {
		// TODO Auto-generated constructor stub
	}

	//우클릭 - source - 아래 3번째 generate Constructor using fields
	
	public Goods(String name, int price, int numberOfStock, int sold) {
		
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
	
	public String toString() {
		return String.format("%-14s %8d %5d %5d",name,price,numberOfStock,sold);
	}

	
}
