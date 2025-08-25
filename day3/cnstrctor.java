package day3;


class other{
	int x;
	boolean y;
	other(){
		x=10;
		y=false;
		System.out.println(x+""+y);
	}
	other(int x,boolean y){
		this.x=x;
		this.y=y;
		System.out.println(x +""+ y);
	}
}

 class cnstrctor {
	 int n;
		String s;
		cnstrctor()
		{ n=90;
		 s="jhvhk";
			System.out.println(s+" "+n);
		}
		cnstrctor(int n,String s)
		{ this.n=n;
		 this.s=s;
			System.out.println(s+" "+n);
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 cnstrctor o1=new cnstrctor();
 cnstrctor o2=new cnstrctor(25,"hwebfg");
 other ob1=new other();
 other ob2=new other(258,true);
 
 
	}

}
