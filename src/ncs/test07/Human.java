package ncs.test07;

public class Human {
	private String name;
	private int age;
	private int height;
	private int weight;
	
	public Human(){}
	
	public Human(String name, int age, int height, int weight){
		super();
		this.name = name;
		this.age = age;
		this.height= height;
		this.weight = weight;
	}
	
	@Override
	public String toString(){
		//return name +"\t"+ age +"\t"+ height+"\t"+weight;
		return String.format("%10s %5d %5d %5d", name,age,height,weight);
	}
}
