package java006_class.part01;

//클래스의 두가지 용도
//1) 라이브러리(library)클래스 : 실행할수 없으며 다른 클래에서 이용하는 클래스
//2) 실행클래스 : main()메소드를 가지고 있는 실행가능한 클래스


//사용자가 정의한 자료형
//클래스 정의
public class Person {
	//멤버변수
	 String name;
 int age;
 char gender;

 //생성자
 Person(){ }    

 //메소드
 void develop(){
   System.out.println("개발한다");
 }

 //메소드
 void run(){
  System.out.println("달린다");
 }
} //end Person

