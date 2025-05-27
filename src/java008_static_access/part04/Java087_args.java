package java008_static_access.part04;

// javac -d jave087_args.java
// java -cp. java008_static_access.part04.java087_args hello

public class Java087_args {
	
	public static void main(String[] args) {
		System.out.println(args[0]); 
		for(String data : args) {
			System.out.println(data);
		}
		

	}//end main()

}
