package java024_lombok.part02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data
@AllArgsConstructor       // 인자값이 있는 생성자
@ToString
@Getter
@Setter

@NoArgsConstructor      //인자값이 없는 메소드
public class MemDTO {
	private int num;
	private String name;
	private int age;
	private String loc;

}
