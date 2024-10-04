package C_in.kanha.methods;
class Rectangle{
	int length;
	int breadth;
	public  void addValue(int a,int b) {
		length = a;
		breadth = b;
	}	
	public void display() {
		System.out.println("length : "+length);
		System.out.println("breadth : "+breadth);
	}	
	public void area() {
		System.out.println("area : "+ length * breadth);
	}	
	public static  void separate() {
		System.out.println("*************************");
	}
}
public class RectangleTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.display();// 0 0
		r1.addValue(10, 20);
		r1.display(); // 10 20
		r1.area();		
		Rectangle.separate();		
		Rectangle r2 = new Rectangle();
		r2.display();// 0 0
		r2.addValue(30, 2);
		r2.display(); // 10 20
		r2.area();		
		Rectangle.separate();		
		Rectangle r3 = new Rectangle();
		r3.display();// 0 0
		r3.addValue(60, 2);
		r3.display(); // 10 20
		r3.area();		
		Rectangle.separate();	
		}
}
