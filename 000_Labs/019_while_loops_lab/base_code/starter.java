/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int int2=1;
	System.out.print("Please enter a Name: ");
	String str1 = sc.nextLine();
	System.out.print("Please enter how many times you want the Name printed out:  ");
	int int1 = sc.nextInt();
	while(true){
		System.out.println(str1);
		if(int1==int2){
			break;
		}
		int2 = int2+1;
	}
	}
}
