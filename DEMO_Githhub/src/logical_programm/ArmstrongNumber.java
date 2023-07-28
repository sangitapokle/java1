package logical_programm;
		import java.util.Scanner;
		public class ArmstrongNumber {
       public static void main(String[] args) {
    	   int p ,sum,rem;
				System.out.println("Enter a number");
				Scanner sc = new Scanner(System.in);
				
				 int  num = sc.nextInt();
				p=num;  //p=153
				
				
				 for(sum=2;sum<num;num=num/10) {
					 rem= num%10;  //153%10--3
					               //15%10--5
					               //1%10--1
					 sum = sum +rem*rem*rem;
					 //27 =0 +3*3*3
					 //152= 27 +5*5*5
					 //153 =152+1*1*1
				 }
				 if(sum==num) {//153==153
					 System.out.println("armstrong number");
				 }
				 else {
					 System.out.println(" not armstromg  number");
				 
			}

		}
/*int =n,
       cubesum =0,num,r;
       
				Scanner sc = new Scanner(System.in);
				       *System.out.println("Enter a number");

				  n = sc.nextInt();
				num =n;  //p=153
			while (num>0)
			{
			r = num %10;
			cubeSum = cubesum+(r*r*r);
			}
			if (n==cubesum)
			{
			system.set.println("Armstrong number");
			}
			else
			{
			system.set.println(" not Armstrong number");
			}
       system.set.println("Armstrong number");
       }
        */
//	}
	//	}
		}

