package day3;
import java.util.*;

public class VarInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var name="hiii";
		/*var x=10;
		x="jbdskj";
		type cannot be changed later
		*/
		var y=20.5;
		var arr=new int[5];
		var arl=new ArrayList<Integer>();
		arl.add(25);
		arl.add(50);
		//arl.add("jkbk"); error cant change type
		var arll=new ArrayList<>();
		arll.add(1);
		arll.add(2);
		arll.add("jkbk"); 
		for(var x:arl) {
			System.out.println(x);
		}
		for(var x:arll) {
			System.out.println(x);
		}
		
		System.out.println(name);

	}

}
