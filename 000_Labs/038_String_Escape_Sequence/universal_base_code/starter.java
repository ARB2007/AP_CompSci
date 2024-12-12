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
		System.out.print("What pet peeve do you want to say to the program: ");
		String cat1 = sc.nextLine();
		System.out.println("Program says: ");
		System.out.println("I dont agree with you that \""+cat1+"\"");
		System.out.println("I think that \""+cat1+"\" is reasonable \\\\ You can go take your pet peeve somewhere else!");
	}
}
