package C_in.kanha.methods;

class A{	
	int i ;
	public void changeI() {
		i = 10;
	}
	public void display() {
		System.out.println(i);
	}
}
public class AnonymousAndAbondened {
	public static void main(String[] args) {
// ****************************************************************************	
//		A a1 = new A();
//		 a1.changeI();
//		 a1.display(); // 10 
//	   new A().display(); //Anonmymous (object with out any reference )
		
// ****************************************************************************		
        A a1 ;
        a1 = new A(); // Abondonded object (An object whose refereance is removed and which can not be used untill garbage collect)
        a1.changeI();
        a1.display(); // 10
        System.out.println(a1);
        
        a1 = new A();
        a1.changeI();
        a1.display();
        System.out.println(a1);
// *******************************************************************************        
//		A a1 = new A();
//		a1.changeI();
//		a1.display(); // 10 
//		
//		A a2 = a1;
//		a2.display(); // 10
//		
//		A a3 = a2;
//		a3.display();
//		
//		System.out.println(a1);
//		System.out.println(a2);
//		System.out.println(a3);
		
	}

}
