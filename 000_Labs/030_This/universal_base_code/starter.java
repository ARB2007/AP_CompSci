/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
	

	public static void main(String args[]) {
		int random = (int)(Math.random()*7);
		PooleDwarf test = new PooleDwarf(randName(),random);
		String Dwarf1 = "Dopey";
		String Dwarf2 = "Bashful";
		String Dwarf3 = "Grumpy";
		String Dwarf4 = "Sleepy";
		String Dwarf5 = "Sneezy";
		String Dwarf6 = "Happy";
		String Dwarf7 = "Doc";
			int int1 = 0;
			int int2 = 0;
			if(test.isSameName(Dwarf1)){
				int1++;
			}
			else if(test.isSameName(Dwarf2)){
				//System.out.println(Dwarf2);
				int1++;
			}
			else if(test.isSameName(Dwarf3)){
				//System.out.println(Dwarf3);
				int1++;
			}
			else if(test.isSameName(Dwarf4)){
				//System.out.println(Dwarf4);
				int1++;
			}
			else if(test.isSameName(Dwarf5)){
				//System.out.println(Dwarf5);
				int1++;
			}
			else if(test.isSameName(Dwarf6)){
				//System.out.println(Dwarf6);
				int1++;
			}
			else if(test.isSameName(Dwarf7)){
				//System.out.println(Dwarf7);
				int1++;
			}
			int2++;
			if(test.isSameName("")){
				System.out.println(test.getName("Happy")+"Was the Dwarf");
				//System.out.println("There were "+int1+" duplicates");
			}
		}
	}

