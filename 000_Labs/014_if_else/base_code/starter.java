/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	int random = (int)(Math.random()*1000);
	Scanner sc = new Scanner(System.in);
	System.out.println(random);
	//System.out.println(random);
	System.out.println("Please enter a number 1-1000: ");
	int num1 = sc.nextInt();
	if(num1==random){
		System.out.println("Thats correct!");
	}
	else{
		System.out.println("That is not correct.");
	}
	
	}
}
