/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int int2= 589;
		while(true){
		System.out.println("Please guess a number 1-1000: ");
		int int1 = sc.nextInt();
			if(int1==int2){
				System.out.println("Thats correct!");
				break;
			}
			else{
				System.out.println("Thats incorrect.");
			}
		}



		
	}
}
