package java010_abstract_interface.part04;

public interface CarRun {
	int carCount=5;   // public static fanal
	
	//public CarRun(){}
	//static {}
	
	void prn();    //public abstract
	
	class Sun{
		public Sun() {
			System.out.println("Sun constructor");
		}
	}
	
	default void call() {
		System.out.println("CarRun call");
	} 
	
	static void display() {
		System.out.println("display");
	}

}
