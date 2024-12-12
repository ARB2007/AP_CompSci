/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String user1 = new String();
	String Wizard = new String("Wizard");
	String Warrior = new String("Warrior");
	String Rogue = new String("Rogue");
	String Wizard1 = new String("wizard");
	String Warrior1 = new String("warrior");
	String Rogue1 = new String("rogue");
	System.out.print("Would you like to be a Wizard,Warrior, or Rogue: ");
	String user = sc.nextLine();
	System.out.println("You chose: "+user);
	}
}
