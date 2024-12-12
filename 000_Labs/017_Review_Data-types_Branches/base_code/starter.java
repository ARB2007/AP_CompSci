/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int int1 = 20;
	System.out.print("Please enter your characters name: ");
	String name1 = sc.nextLine();
	System.out.print("Please enter your characters title: ");
	String title1 = sc.nextLine();
	System.out.print("Would you like to be a Wizard,Warrior or Rogue: ");
	String class1 = sc.nextLine();
	System.out.print("How many Strength points do you want(You have "+int1+" left):" );
	int int2 = sc.nextInt();
	int1 = int1-int2;
	System.out.print("How many Dexterity points do you want(You have "+int1+" left): ");
	int int3 = sc.nextInt();
	int1 = int1-int3;
	System.out.print("How many Intelligence points do you want(You have "+int1+" left): ");
	int int4 = sc.nextInt();
	int1 = int1-int4;
	System.out.print("How many Charisma points do you want(You have "+int1+" left): ");
	int int5 = sc.nextInt();
	int1 = int1-int5;
	
	System.out.println("Your name is: "+name1);
	System.out.println("Your title is: "+title1);
	System.out.println("Your class is: "+class1);
	System.out.println("Your Strength is: "+int2);
	System.out.println("Your Dexterity is: "+int3);
	System.out.println("Your Intelligence is: "+int4);
	System.out.println("Your Charisma is: "+int5);
	System.out.println("You have "+int1+" leftover points.");
	}
}
