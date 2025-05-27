package java012_api.part02;

public class Member {
	
	int id;
	public Member() {                //생성자
		// TODO Auto-generated constructor stub
	}
	
	public Member(int id) {              //생성자
		this.id=id;
	}
	
	@Override
	public boolean equals(Object obj) {     // 업캐스팅
		if(obj instanceof Member)
			return id == ((Member)obj).id;  // 다운캐스팅
		else
			return false;
	}

}
