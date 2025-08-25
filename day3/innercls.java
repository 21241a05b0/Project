package day3;
class Apple{
	int x=6;
	class Mango{
		void display(){
			System.out.println("inner class"+ x);
		}
	}
}
public class innercls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple ap=new Apple();
		Apple.Mango mg= ap.new Mango();
	//	Mango mg=new Mango();
		mg.display();
		//ap.display();
		//System.out.println(mg.x);
	

	}

}
