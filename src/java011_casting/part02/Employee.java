package java011_casting.part02;

public class Employee /* extends Object */{

	String name;
	String code;
	
	public Employee() {
		
	}
	public Employee(String name,String code) {
		this.name=name;
		this.code=code;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("name:%s cod:%s", name, code);
	
	}
	public String pay() {
		return String.format("%s님의 급여는 %d입니다.",name,5000);
	}
}

