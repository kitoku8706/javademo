package java012_api.part06;

public class Java122_String {
	
	public static void main(String[] args) {
		String sn = "127.0.0.1:8080";
		int index = sn.indexOf(":");
		
		System.out.println("[출력결과]");
		
		System.out.printf("ip  : %s\n",sn.substring(0,index));
		System.out.printf("port: %s\n",sn.substring(index+1)); 
		
		System.out.println("===================");
		String[] data = sn.split(":");
		System.out.println("ip  : "+data[0]);
		System.out.println("port: "+data[1]);
		
	}//end main()

}
