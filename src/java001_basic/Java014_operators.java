package java001_basic;
//

// 조건연산자 : 식의 결과에 리턴해주는 값이 여러개 일때 사용한다.
// 
// 조건식 ? 참 : 거짓
//
// int res = 조건식 ? 1 : 0;
// char res = 조건식 ? 'a' : 'A';
//

public class Java014_operators {

	public static void main(String[] args) {
		int total =26;
		int record=5;
		
		int res = total % record ==0 ? total/record : total/record +1;
		//res = total % record ==0 식
		//total/record 참
		//total/record +1 거짓
		//res = total % record ==0 식이 true이면 total/record  계산해서 res변수에 할당한다.
		//res = total % record ==0 식이 false이면 total/record +1  계산해서 res변수에 할당한다.
		System.out.println(res);
		
		
		int jumsu=55;
		// jumsu >=80 : 상, jumsu < 80 && jumsu >= 60 : 중, jumsu < 60 : 하
		// 100~80 상    79~60 중    59~0 하
		
		char check= jumsu >=80 ? '상' : jumsu >= 60 ? '중':'하';
		System.out.println(check);
		
		check = jumsu>=60? jumsu>=80?'상':'중':'하';
		// 점수가 60점보다 이상이고 점수가 80점이상
		// ture and ture 상
		// ture and false 중
		// false and false 하
		System.out.println(check);
		

	}

}
