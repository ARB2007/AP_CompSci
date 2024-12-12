/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int int1 = sc1.nextInt();
		System.out.println("Please enter the second number: ");
		int int2 = sc1.nextInt();
		System.out.println("Please enter the third number: ");
		int int3 = sc1.nextInt();
		if((int1>int2)&&(int1>int3)){
			System.out.println(int1+" is the largest number");
		}
		if((int2>int1)&&(int2>int3)){
			System.out.println(int2+" is the largest number");
		}
		if((int3>int1)&&(int3>int2)){
			System.out.println(int3+" is the largest number");
		}
		if((int1<int2)&&(int1<int3)){
			System.out.println(int1+" is the smallest number");
		}
		if((int2<int1)&&(int2<int3)){
			System.out.println(int2+" is the smallest number");
		}
		if((int3<int1)&&(int3<int2)){
			System.out.println(int3+" is the smallest number");
		}
	}
}
