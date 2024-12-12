/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Wizard Wd = new Wizard();
		Wizard[] Wizards = new Wizard[100];
		Wizards[0] = new Wizard();
		Warrior Wr = new Warrior();
		Warrior[] Warriors = new Warrior[100];
		Warriors[0] = new Warrior();
		int num2 = 0;
		int num3 = 0;
		int num10 = 100;
		int num11 = 100;
		for(int i = 0;i<Warriors.length;i++){
			Warriors[i] = new Warrior();
		}
		for(int e = 0;e<Wizards.length;e++){
			Wizards[e] = new Wizard();
		}
		int num1 = 3;
		while (true) {
        	if(num1 % 2 == 1) {
            Wizards[num2].attack(Warriors[num3]);
            if(Warriors[num3].isDead()) {
            num3++;
            if (num3 == 99) {
            System.out.println("All Warriors have died, Wizards win with " + (100-num2) + " remaining");
            break;
            }
        }
    		num1++;
    } 
            else{
                Warriors[num3].attack(Wizards[num2]);
            if(Wizards[num2].isDead()) {
                num2++;
            if(num2 == 99) {
               System.out.println("All Wizards have died, Warriors win with " + (100-num3) + " remaining");
               break;
                    }
                }
               num1--;
            	}
			}
		}
	}
