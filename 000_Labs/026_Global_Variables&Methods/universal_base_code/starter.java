/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;
class myCharacter{
	int dexterity;
	int strength;
	int charisma;
	int intelligence;
	String role;
	public myCharacter(){
		dexterity =5;
		strength =5;
		charisma = 5;
		intelligence = 5;
		role = "Rogue";
	}
	public void toString(String role2){
		System.out.println("Your role is "+role);
		System.out.println("Your Dexterity is "+dexterity);
		System.out.println("Your Strength is "+strength);
		System.out.println("Your Charisma is "+charisma);
		System.out.println("Your Intelligence is "+intelligence);
	}
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		myCharacter test = new myCharacter();
		test.toString("");
	}
}
