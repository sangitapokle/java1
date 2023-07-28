package logical_programm;

public class String_reverse {

	public static void main(String[] args) {
//
		String s1= "sangita sugriv pokle";
		
		String s2[]=s1.split(" ");
		
		for(int i= s2.length-1;i>=0;i--) {
			System.out.println(s2[i]);
	}
	

		
	

 String name ="Automation";
//	System.out.println(name.charAt(-1) );	
	    System.out.println("Index--->>"  +name.charAt(5));//a
		System.out.println("index====>"+name.charAt(9));//n
		System.out.println("index ===>" +name.charAt(3));	//0
		//System.out.println("index ===>" +name.charAt(12) );	//String index out of bound expectation
	}}