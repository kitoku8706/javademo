package java015_exception;

public class Java166_exception {
	public static void main(String[] args) {
		int data=15;
		
		try{
		if(data<10) {
			throw new UserException("10이상만 가능합니다.");
		}
		System.out.println(data);
		}catch (UserException ex) {
			System.out.println(ex.getMessage());
		}

	}//end main()

}
