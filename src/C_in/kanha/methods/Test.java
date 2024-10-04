package C_in.kanha.methods;

class Demo{
	
	public static void st() {
		System.out.println("Static ");
	}
	
	public void nst() {
		System.out.println("non-static");
	}
}
public class Test {

	public static void main(String[] args) {

		Demo.st();
		
		Demo d = new Demo();
		
		d.nst();
		
		
		
		
	}

}

   
