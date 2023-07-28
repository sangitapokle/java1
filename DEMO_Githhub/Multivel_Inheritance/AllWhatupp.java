package Multivel_Inheritance;

public class AllWhatupp extends  Whatsup3 {

	public static void main(String[] args) {
		
		AllWhatupp a1= new AllWhatupp();
		a1.audiocall();
		a1.vedio();
		a1.payment();
		System.out.println();
	Whatsup1	a2= new Whatsup2();
			
		a2.audiocall();
		System.out.println();
		Whatsup1	a3= new Whatsup3();
		System.out.println();
Whatsup2 a4 =new Whatsup3();
 a4.audiocall();
 a4.vedio();
 System.out.println();
     Whatsup3   a5= new AllWhatupp();
a5.audiocall();
a5.payment();
a5.vedio();
	}

}
