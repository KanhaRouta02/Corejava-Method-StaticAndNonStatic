package B_in.kanha.variables;

class DemoTest {
	static int i ; // static variable
	int j ; // non static
	public static void test() {
//		System.out.println(i);
//		System.out.println(new DemoTest().j);
	}
}
public class Demo {
	public static void main(String[] args) {
		int k ; // local variable
		k=10;
		System.out.println(k);
		
		
		DemoTest.i = 10;
		System.out.println(DemoTest.i);
		DemoTest d = new DemoTest();
		d.j=20;
		System.out.println(d.j);	
	}
}
