package java012_api.part04;

public class Address implements Cloneable {
	String city;
	String dong;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(String city,String dong) {
		this.city=city;
		this.dong=dong;
	}
	public Address clone() {
		Address address = null;
		
		try {
			address=(Address) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return address;	
	}
	

}
