package java002_statements;

//삼중if문

//if (data >= 'A' && data <= 'Z') {System.out.printf("%c는 대문자입니다.\n", data);}else if (data >= 'a' && data <= 'z') {	System.out.printf("%c는 소문자입니다.\n", data);}else {System.out.printf("%c는 기타입니다.\n", data);}
//삼중if문

public class Java000_fom {

	public static void main(String[] args) {
		char data = 'B';
		
		if (data >= 'A' && data <= 'Z') {
			System.out.printf("%c는 대문자입니다.\n", data);
		} else if (data >= 'a' && data <= 'z') {
			System.out.printf("%c는 소문자입니다.\n", data);
		} else {
			System.out.printf("%c는 기타입니다.\n", data);
		}

	}

}

//
// if (조건) {참일때값} else {거짓일때 값}
// if (조건) {참일때값} else if (조건) {참일때값} else {거짓일때 값}
//

//3중if문
//char data = 'B';
//if (data >= 'A' && data <= 'Z') {
//	System.out.printf("%c는 대문자입니다.\n", data);
//} else if (data >= 'a' && data <= 'z') {
//	System.out.printf("%c는 소문자입니다.\n", data);
//} else {
//	System.out.printf("%c는 기타입니다.\n", data);
//}