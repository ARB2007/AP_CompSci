/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter an integer: ");
	int int1 = sc.nextInt();
	System.out.print("Please enter another integer: ");
	int int2 = sc.nextInt();
	if(int1%2==0&&int2%2==0){
		System.out.println("Both "+int1+" and "+int2+" are even.");
	}
	if(int1%2!=0&&int2%2!=0){
		System.out.println(int1+" is odd and "+int2+" is also odd.");
	}
	if(int1%3==0&&int2%3==0){
		System.out.println("Both "+int1+" and "+int2+" are divisible by 3.");
	}
	if(int1%3!=0&&int2%3!=0){
		System.out.println("Both "+int1+" and "+int2+" are not divisible by 3.");
	}
	if(int1%4==0&&int2%4==0){
		System.out.println("Both "+int1+" and "+int2+" are divisible by 4.");
	}
	if(int1%4!=0&&int2%4!=0){
		System.out.println("Both "+int1+" and "+int2+" are not divisible by 4.");
	}
	if(int1%5==0&&int2%5==0){
		System.out.println("Both "+int1+" and "+int2+" are divisible by 5.");
	}
	if(int1%5!=0&&int2%5!=0){
		System.out.println("Both "+int1+" and "+int2+" are not divisible by 5.");
	}
}
}
