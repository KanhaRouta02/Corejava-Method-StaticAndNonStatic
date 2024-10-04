package C_in.kanha.varargs;

public class AddNumber {

	public static void main(String[] args) {
		add(10,20);
	}
	
//	public static void add(int a,int b) {
//		System.out.println(a+b);
//	}
//	public static void add(int a,int b,int c) {
//		System.out.println(a+b+c);
//	}
//	public static void add(int a,int b,int c,int d) {
//		System.out.println(a+b+c+d);
//	}
	
	public static void add(int... arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
