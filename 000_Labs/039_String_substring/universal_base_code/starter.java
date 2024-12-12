/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc= new Scanner(System.in);
		System.out.print("Please enter in a 6 letter word: ");
		String str1 = sc.nextLine();
		System.out.println(str1.substring(0,1));
		System.out.println(str1.substring(1,2));
		System.out.println(str1.substring(2,3));
		System.out.println(str1.substring(3,4));
		System.out.println(str1.substring(4,5));
		System.out.println(str1.substring(5));
		
	}
}
