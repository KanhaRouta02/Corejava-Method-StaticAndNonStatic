package C_in.kanha.catogoriesofmethods;
public class Test {
	public static void main(String[] args) {
//		Test.printNumber();
//		printDouble(20.0);
//		String res = printString();
//		System.out.println(res);
		System.out.println(retunInteger("kanha"));		
	}	
	//No argument No return type	
	public static void printNumber() {
		System.out.println("Number printing...");	
	}	
	//With argument No return type	
	public static void printDouble(Double d) {
		System.out.println(d);
	}
	//No argument With return type	
	public static  String  printString() {
	    String s = "Hello Java";
	    return s;	    
	}	
	//With argument with return type	
	public static String retunInteger(String i) {	
		System.out.println(i);
		return "i";		
	}
	
}
