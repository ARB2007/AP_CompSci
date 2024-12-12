/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;
	public class myCharacter{
		public int setDexterity;
		public int setCharisma;
		public int setStrength;
		public int setIntelligence;
		public String setRole;
		public myCharacter(){
			setStrength = 0;
			setCharisma = 0;
			setIntelligence = 0;
			setDexterity=0;
		}
		public void setRole(String role1){
			if(role1=="Rogue"){
				System.out.println("Your role is Rogue");
		}
		if(role1=="Wizard"){
			System.out.println("Your role is Wizard");
		}
		if(role1=="Warrior"){
			System.out.println("Your role is Warrior");
		}
		}
		public void setStrength(int Strength){
			System.out.println("Your Strength is "+ Strength);
			if(Strength<0){
				Strength = 0;
			}
		}
		public void setCharisma(int Charisma){
			System.out.println("Your Charisma is "+Charisma);
			if(Charisma<0){
				Charisma = 0;
			}
		}
		public void setIntelligence(int Intelligence){
			System.out.println("Your Intelligence is "+Intelligence);
			if(Intelligence<0){
				Intelligence = 0;
			}
		}
		public void setDexterity(int Dexterity){
			System.out.println("Your Dexterity is "+Dexterity);
			if(Dexterity<0){
				Dexterity = 0;
			}
		}
		}

