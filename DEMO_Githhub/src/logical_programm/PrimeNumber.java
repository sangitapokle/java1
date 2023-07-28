package logical_programm;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
//Prime no== pm is number that greter than1 and divided by 1 or itself only.
//ex== 2,3,,5,7,11,13,17...
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		
		 int  num = sc.nextInt();
		 int i;
		 for(i=2;i<num;i++)
			 if(num%1==0)
				 break;
		 if(i==num)
			 System.out.println("prime number");
		 else
			 System.out.println(" not prime number");
		 
	}

}
