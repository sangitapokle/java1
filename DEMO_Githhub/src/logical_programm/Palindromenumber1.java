package logical_programm;
import java.util.Scanner;
public class Palindromenumber1 {

	public static void main(String[] args) {
int Originalnumber,sum,rem;
//ex==12453; 35414
System.out.println("enter an number");

Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
Originalnumber = num;

//121
//0; 121>0 ===true
//12/10==12
//12/10--1
//1>0 --true
//1>10 --0
//0>0--false

for (sum=0;num>0;num=num/10) {
	
	rem = num %10;//121%10--->2     1%10-->1
	sum= sum*10+rem;//0= 0*10+1==1
	                //1 =1*10+2==12
	                //12= 12*10+1==121
}
//121 ==121
if(sum ==Originalnumber) {
	System.out.println(Originalnumber+ "--->it is palindromenumber");
}
else {	
System.out.println(Originalnumber+ "--->it is not a palindromenumber");

	}
	}

}