/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter a number: ");
	int int1 = sc.nextInt();
	double int2 = int1;
	double int3 = 100;
	double int4 = 10;
	System.out.println("Here are the next 5 number: "+(int1)+" "+(int1+1)+" "+(int1+2)+" "+(int1+3)+" "+(int1+4)+" "+(int1+5));
	System.out.println("Here are the next 5 multiples of 5: "+(int1)+" "+(int1*2)+" "+(int1*3)+" "+(int1*4)+" "+(int1*5)+" "+(int1*6));
	System.out.println("Here is 5 divided by 100: "+(int1/int3));
	System.out.println("Here is 5 divided by 10: "+(int1/int4));
	}
}
