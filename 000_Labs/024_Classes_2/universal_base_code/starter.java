/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import myCharacter.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		myCharacter character = new myCharacter();
		System.out.println("Your class is: "+character.class1);
		System.out.println("Dexterity: "+character.Dexterity);
		System.out.println("Strength: "+character.Strength);
		System.out.println("Intelligence: "+character.Intelligence);
		System.out.println("Charisma:  "+character.Charisma);
	}
}
