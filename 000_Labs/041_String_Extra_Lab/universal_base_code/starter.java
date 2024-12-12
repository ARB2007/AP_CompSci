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
		int int1 = 0;
		int int2 = 0;
		int int3 = 0;
		int int5 = 0;
		boolean boolean1 = true;
		String str2 = "";
		String str3 = "";
		System.out.print("Please enter in a phrase: ");
		String str1 = sc.nextLine();
		int int4 = str1.length();
		int i = 0;
		while (true) {
    	if (str1.indexOf(" ") == -1) {
        	System.out.print(str1);
        	break;
    	}
    		int space = str1.IndexOf(" ");
    		String word = str1.substring(space + 1);
    		System.out.print(word + " ");
    		str1 = str1.substring(0, space);
		}
	}
}