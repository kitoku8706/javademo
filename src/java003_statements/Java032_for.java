package java003_statements;

public class Java032_for {

	public static void main(String[] args) {
		int data = 1;

//		for(int i=1; i<=12; i++) {
//			System.out.printf("%4d",i);
//			if (i%4==0) {// if문은 수행문장이 1개일때 {}생략가능하다
//				System.out.println("\n");	
//				}

		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 4; col++) {
				System.out.printf("%4d", data);
				data = data + 1;
			}
			System.out.println("\n");
		}
	}
}

