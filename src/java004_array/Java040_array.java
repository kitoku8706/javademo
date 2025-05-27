package java004_array;

public class Java040_array {
	public static void main(String[] args) {
		int[] arr = new int[] { 90, 80, 40 };
		// 초기값을 할당하면서 배열을 생성할 때는 배열의 크기를 지정할 수 없다.

		for (int i = 0; i < arr.length; i++) {
//			System.out.printf("1번arr[%d]=%d\n", i, arr[i]);
			System.out.printf("1번arr[%d]=%d ", i, arr[i]);

		}
		System.out.println();
		System.out.println();
		
		for (int i = arr.length - 1; i >= 0; i--) {
//			System.out.printf("2번arr[%d]=%d\n", i, arr[i]);
			System.out.printf("2번arr[%d]=%d ", i, arr[i]);
		}
		System.out.println();
		System.out.println();
		
		int[] data= {90,80,40};
		for(int i =0;i<data.length;i++) {
//			System.out.printf("data[%d]=%d\n", i, data[i]);
			System.out.printf("data[%d]=%d ", i, data[i]);
		}

	}// end main()

}
