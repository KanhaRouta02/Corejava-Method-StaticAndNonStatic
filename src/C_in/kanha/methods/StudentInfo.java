package C_in.kanha.methods;

class Student{
	int sid;
	String sname;
	int sage;
	long sphone;
	static String collageName; // static context
	
	public void lodeStudent(int id,String name,int age,long phone, String collage) {
		sid = id;
		sname = name;
		sage = age;
		sphone = phone;
		collageName = collage;
	}
	
	public void display() {
		System.out.println("student id : "+sid);
		System.out.println("student name : "+sname);
		System.out.println("student age : "+sage);
		System.out.println("student phone : "+sphone);
		System.out.println("student collage : "+collageName);
	}
	
	public static void separeate() { // static method
		System.out.println("*************************"); 
	}
}

public class StudentInfo {
	public static void main(String[] args) {
		
		System.out.println(Student.collageName);
		Student.separeate();
		
		
		Student s = new Student();
		System.out.println(s.sname);
		
		
	}
	
	
	
}
