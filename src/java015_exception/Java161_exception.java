package java015_exception;

public class Java161_exception {
	public static void main(String[] args) {
		StringBuffer sBuffer = null;
		
		
		try {
		sBuffer.rverse();
		}catch (NullPointerException ex) {
			sBuffer = new StringBuffer("java");
			sBuffer.rverse();
			System.out.println(sBuffer);
		}

	}//end main()

}
