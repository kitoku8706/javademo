package java009_inheritance.prob.part01;


public class ClassTest_2 extends ClassTest_1{
String department;
	
	ClassTest_2(String name, int salary, String department){
		super(name,salary);
		this.department=department;
		
	}
	
	public void callSuperThis() {
		super.prn();
		System.out.println("서브클래스");
	}
	
	



}
