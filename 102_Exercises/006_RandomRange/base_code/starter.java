/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter the starting range: ");
	int int1 = sc.nextInt();
	System.out.print("Please enter the ending range: ");
	int int2 = sc.nextInt();
	int2 = int2-int1;
	//int int3 = (int)(Math.random()*int2)+int1;
	System.out.print((int)(Math.random()*int2)+int1);
	}
}
