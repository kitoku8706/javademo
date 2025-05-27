package java004_array;

public class Java041_array {
	public static void main(String[] args) {
		int[] num=new int[] {22,3,8,12};
		int sum = 0;
//		sum = sum+num[0]; // 22=0+22
//		sum = sum+num[1]; // 25=22+3
//		sum = sum+num[2]; // 33=25+8
//		sum = sum+num[3]; // 45=33+12
		
		
		for(int i=0;i<num.length;i++) {
			
			sum=sum+num[i];                   // 축약
			System.out.printf("num[%d]=%d\n",i,sum);
			
		}
		System.out.println("num.length 값: "+num.length);
		
		System.out.println("합계:"+sum);
		
		
		
		

	}//end main()

}
