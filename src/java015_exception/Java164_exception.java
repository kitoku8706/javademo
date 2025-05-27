package java015_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java164_exception {
	
	public static void main(String[] args) /* throws FileNotFoundException */ {
		File file = new File("sample.txt");
		System.out.println(file);
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			
			//FileNotFoundException은 checked exception이다.
			//반드시 try~catch~finally(예외처리)를 한다.
			
			System.out.println(fr.read());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}//end main()

}
