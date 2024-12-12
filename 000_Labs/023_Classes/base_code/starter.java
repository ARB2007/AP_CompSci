/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class Character{
	String class1 = new String("Wizard");
	int Dexterity = 5;
	int Strength = 5;
	int Intelligence = 5;
	int Charisma = 5;
}


class starter {
	public static void main(String args[]) {
	Character myCharacter = new Character();
	System.out.println(myCharacter.class1);
	System.out.println("Charisma: "+myCharacter.Charisma);
	System.out.println("Strength: "+myCharacter.Strength);
	System.out.println("Dexterity: "+myCharacter.Dexterity);
	System.out.println("Intelligence: "+myCharacter.Intelligence);
	}
}
