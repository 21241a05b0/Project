package day3;
import java.util.Random;
//import java.util.random.*;
class cse{
	int rno;
	String name;
	 static float marks;
	static char sec='b';
	cse(int no,String n){
		rno=no;
		name=n;
		
		
	}
	void display() {
		System.out.println(rno+"  "+name+" "+sec+" "+marks);
	}
	static void change() {
		sec='c';
	}
	static {
		System.out.println("hello");
	}
	
}



public class StaticInJava {
	
	
	
	
	public static void main(String[] args) {
		cse s1=new cse(1,"abc");
		cse.marks=new Random().nextInt(100);//50
		System.out.println(s1.marks);
		cse s2=new cse(2,"def");
		s2.marks=new Random().nextInt(100);//50
		System.out.println(s2.marks);
		cse s3=new cse(3,"hij");
		s3.marks=new Random().nextInt(100);//85
		System.out.println(s3.marks);
		
		s1.display();
		s1.change();
		s2.display();
		s3.display();
		s1.display();
		
	}
	static {
		System.out.println("cse-b details");
	}
}
