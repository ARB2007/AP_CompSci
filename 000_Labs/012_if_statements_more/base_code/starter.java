/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the first number: ");
	int int1 = sc.nextInt();
	System.out.println("Please enter the second number: ");
	int int2 = sc.nextInt();
	boolean int3 = int1==int2;
	if(int3){
		System.out.println(int2+" are equal "+int1);
	}
	else{
		System.out.println(int2+" and "+int1+" are not equal ");
	}
	}
}
