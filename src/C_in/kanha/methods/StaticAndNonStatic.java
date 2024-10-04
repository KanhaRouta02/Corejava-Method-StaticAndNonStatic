package C_in.kanha.methods;
class B{	
	int i ;
	static int j ;	
	public  void change() {
		j++;
		++i;
		
	}
    public void printIJ() {
    	System.out.println(i + " " + j);
    }
}
public class StaticAndNonStatic {
	public static void main(String[] args) {
//		B a1 = new B();
//		a1.change();
//		a1.printIJ(); // 1  1
//		
//		B a2 = new B();
//		a2.change();
//		a2.printIJ(); // 1  2
//		
//		B a3 = new B();
//		a3.change();
//		a3.printIJ(); // 1  3		
		// 1 3
        // 1 3
	    // 1 3
		
//		B a1 = new B();
//		B a2 = new B();
//		B a3 = new B();
//		
//		a1.change();
//		a2.change();       // 1  0
//		a3.change();       // 1  1
//		                   // 1  2
//		
//		a1.printIJ();  // 1  3
//		a2.printIJ();  // 1  3
//		a3.printIJ();  // 1  3
		
		
	}   

}
