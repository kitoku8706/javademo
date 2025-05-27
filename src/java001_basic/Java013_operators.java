package java001_basic;

public class Java013_operators {

	public static void main(String[] args) {
		int a=3;
		int b=5;
		int c=7;
		
		boolean res;
		
		// && 연산자의 좌변이 false이면 우변은 수행하지 않는다.
		res=(++a>b)&&(++b<3);
		System.out.printf("a=%d, b=%d, c=%d, res=%b\n",a,b,c,res);
		System.out.printf("a=%d, b=%d, c=%d, res=(++a>b)&&(++b<3), res=%b\n",a,b,c,(++a>b)&&(++b<3),res);
		
		int x=4;
		int y=8;
		int z=10;
		
		// || 연산자의 좌변이 true이면 우변은 수행하지 않는다.
		res=(z>++y)||(++x>y);
		System.out.printf("x=%d, y=%d, z=%d, res=%b\n",x,y,z,res);
		System.out.printf("x=%d, y=%d, z=%d, res=(z>++y)||(++x>y), res=%b\n",x,y,z,(z>++y)||(++x>y),res);
		
		
		int k=1;
		int m=2;
		int n=3;
		
		res=k==2&&++m==2||++n==4; 
		//1)k==2 false
		//2)k==2&&++m==2 false k=1, m=2
		//3)++n 4  
		//4)++n==4 true
		//5)k==2&&++m==2||++n==4 true
		//6)res= true
		System.out.printf("k=%d, m=%d, n=%d, res=%b\n",k,m,n,res);
		System.out.printf("k=%d, m=%d, n=%d, res = k==2 && ++m == 2 || ++n == 4, res=%b\n",k,m,n,res=k==2&&++m==2||++n==4,res);
		
		
		k=1;
		m=2;
		n=3;
		
		System.out.println("==============");
		System.out.print("기초값 : ");
		System.out.printf("k=%d, m=%d, n=%d\n",k,m,n);
		res=--k==2||m--==3&&++n==4;
		//res=(--k==2)||(m--==3&&++n==4);
		//1)--k=0
		//2)--k==2 false
		//3)m==3 false
		//4)m--=1
		//5)--k==2||m--==3 false  false||false
		//6)res= false
		System.out.println("res = "+res);
		System.out.printf("k=%d, m=%d, n=%d, res=%b\n",k,m,n,res);
		
		
		k=1;
		m=2;
		n=3;
		int p=1;
		
		System.out.println("==============");
		System.out.print("기초값 : ");
		System.out.printf("k=%d, m=%d, n=%d, p=%d\n",k,m,n,p);
		res = --k == --p || m-- == ++p && ++n == 4;
		//res = (--k == --p) || (m-- == ++p && ++n == 4);
		//1)--k =>0
		//2)--p =>0
		//3)--k == --p => true
		//4)--k == --p || m-- == ++p => true
		//5)res= ture
		
		System.out.println("res = "+ res);
		System.out.printf("k=%d, m=%d, n=%d, p=%d, res=%b\n",k,m,n,p,res);

	}

}
