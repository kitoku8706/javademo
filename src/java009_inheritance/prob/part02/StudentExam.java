package java009_inheritance.prob.part02;

public class StudentExam extends Human{
	String hak;
	StudentExam(String name, int age, int height, int weight, String hak){
		super(name, age, height, weight);
		this.hak=hak;
	}
	
	public String toString() {
		String data = name + "\t" + age + "\t" + height + "\t" + weight+"\t"+ hak;
		return data;
	}	
	

}
