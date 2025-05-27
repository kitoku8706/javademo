package java009_inheritance.part03;

public class SuperConst {
	int x;
	int y;
	
	public SuperConst(int x, int y) {
		super(); //인자값이 없는 호출일때 생략가능, 자바머신에서 자동으로 함
		this.x=x;
		this.y=y;
	}

}
