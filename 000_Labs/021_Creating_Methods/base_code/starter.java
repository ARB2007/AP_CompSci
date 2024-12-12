/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
		public static String toString(String str1){
			Scanner sc = new Scanner(System.in);
			System.out.print("Please enter a string you want printed out: ");
			str1 = sc.nextLine();
			//System.out.println(str1);
			return str1;
		}
		public static String toStringCombined(String str2,String str3,String str4){
			Scanner sc1 = new Scanner(System.in);
			System.out.print("Please enter your favorite holiday: ");
			str2 = sc1.nextLine();
			System.out.print("Please enter why: ");
			str3 = sc1.nextLine();
			return str2+str3;
		}
	
		public static void main(String args[]) {
		//System.out.println(toString(""));
		System.out.println(toStringCombined("","",""));
		}
}

