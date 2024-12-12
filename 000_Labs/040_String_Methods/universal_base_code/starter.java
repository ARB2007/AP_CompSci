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
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your full name(First and Last Name): ");
		String str1 = sc.nextLine();
		int [] arr = new int[str1.length()];
		int int1 = str1.length();
		int int2 = 0;
		int i = 0;
		int2 = str1.indexOf(" ");
		while(i < str1.length()){
			i++;
			if(str1.substring(i-1,i).equals(str1.indexOf(" "))){
				int2 = i;
			}
		}
			System.out.println(str1.substring(int2,str1.length()));
	}
}
