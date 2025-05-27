package java006_class.prob.part01;

public class Circle {
	String n;
	int r;
	double w() {
		return 3.14*r*r;
	}
	void display() {
		System.out.printf("%s의 면적은 %.2f\n", n, w());   
		//소수점 %.2f 두번째자리까지 표현
	}
	

}
