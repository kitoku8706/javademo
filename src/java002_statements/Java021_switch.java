package java002_statements;

public class Java021_switch {

	public static void main(String[] args) {
		int jumsu=100;
		// 90이상 : A 89~80 B 79~70 C 69~60 D 59~0 F
		switch(jumsu / 10) {
		case 10:System.out.printf("점수가 %d이므로 학점은 %c입니다.", jumsu,'A');break;
		case 9:System.out.printf("점수가 %d이므로 학점은 %c입니다.", jumsu,'A');break;
		case 8:System.out.printf("점수가 %d이므로 학점은 %c입니다.", jumsu,'B');break;
		case 7:System.out.printf("점수가 %d이므로 학점은 %c입니다.", jumsu,'C');break;
		case 6:System.out.printf("점수가 %d이므로 학점은 %c입니다.", jumsu,'D');break;
		default:System.out.printf("점수가 %d이므로 학점은 %c입니다.", jumsu,'F');break;
		}

	}

}

