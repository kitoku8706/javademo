package java018_collection.part03;

import java.util.LinkedList;

//  stack(스택)
//  1. LIFO(Last In First Out) : 마지막에 저장된 요소를 먼저 꺼낸다.
//  2. 수식계산, 수식괄호검사, undo/redo, 뒤로/앞으로
 
public class Java190_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nStack = new LinkedList<String>();
		nStack.push(new String("java"));
		nStack.push(new String("jsp"));
		nStack.push(new String("spring"));
		
		System.out.println(nStack.get(2)); //java
		System.out.println(nStack.size());  //3
		
//		System.out.println(nStack.pop()); //spring
//		System.out.println(nStack.pop()); //jsp
//		System.out.println(nStack.pop());  //java
//		// java.util.NoSuchElementException
//		System.out.println(nStack.pop());
		
		while(!nStack.isEmpty())
			System.out.println(nStack.pop());
		
		System.out.println(nStack.size());  //0
	}//end main()

}//end class



