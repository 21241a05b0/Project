package day3;


class Appe{
 static class Mango{
	 int x;
		void dissplay() {
			System.out.println("hdafkhf");
		}
	}
}

public class staticinnercls {
	public static void main(String[] args) {
		
	Appe.Mango mg=new Appe.Mango();
	mg.x=10;
	System.out.println(mg.x);
	mg.dissplay();
	}

}
