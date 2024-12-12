/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

public class starter {
    //public int prime1;
	public static boolean checkPrime(int int1) {  // This is the empty constructor
		boolean tf;
		int int2 = 2;
		int int3 = 1;
		if(int1%int2==int3){
			tf = false;
		}
		else{
			tf = true;
		}
		return tf;
	}
	
	
	public static String printPrime(int int2) {
		String prime1 = "";
		boolean boo1 = checkPrime(int2);
		if(boo1 == true){
			System.out.println("The number you entered is prime");
		}
		if(boo1 == false){
			System.out.println("The number you entered is not prime");
		}
		return prime1;
	}
	public static void main(String args[]) {
	printPrime(4);
	}
}
