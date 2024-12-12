/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner scanner1 = new Scanner(System.in);
	int money = 100;
	int integer1 = 0;
	int integer2 = 0;
	int integer3 = 0;
	int integer4 = 0;
	int integer5 = 0;
	//int Random1 = (int)(Math.random(+1)*9);
		System.out.println("You have "+money+" dollars.");
		System.out.println("A pair doubles your money and all 3 triples your money.");
		System.out.print("Would you like to play(Yes,yes,Y,y): ");
		String string1 = scanner1.nextLine();
			if(string1=="Yes"||string1=="yes"||string1=="Y"||string1=="y"){
		}
		while(true){
			System.out.print("How much would you like to bet(You have "+money+" dollars): ");
			integer1 = scanner1.nextInt();
	int random1 = (int)(Math.random()*10);
	int random2 = (int)(Math.random()*10);
	int random3 = (int)(Math.random()*10);
		System.out.println("Your numbers are: "+random1+" "+random2+" "+random3);
		if(random1==random2){
			money = money-integer1;
			integer1 = integer1 *2;
			money = money+integer1;
			System.out.println("You got a pair! You double your money!");
			System.out.println("You now have "+money+" dollars!");
			System.out.println("Would you like to play(Yes,yes,Y,y): ");
			String string2 = scanner1.nextLine();
			if(string2=="Yes"||string2=="yes"||string2=="Y"||string2=="y"){
			System.out.println("How much would you like to bet(You have "+money+" dollars): ");
			integer1 = scanner1.nextInt();
			}
		}
		if(random2==random3){
			money = money-integer1;
			integer1 = integer1 *2;
			money = money+integer1;
			System.out.println("You got a pair! You double your money!");
			System.out.println("You now have "+money+" dollars!");
			System.out.println("Would you like to play(Yes,yes,Y,y): ");
			String string3 = scanner1.nextLine();
			if(string3=="Yes"||string3=="yes"||string3=="Y"||string3=="y"){
			System.out.println("How much would you like to bet(You have "+money+" dollars): ");
			integer1 = scanner1.nextInt();
			}
		}
		if(random1==random3){
			money = money-integer1;
			integer5 = integer5 *2;
			money = money+integer5;
			System.out.println("You got a pair! You double your money!");
			System.out.println("You now have "+money+" dollars!");
			System.out.println("Would you like to play(Yes,yes,Y,y): ");
			String string4 = scanner1.nextLine();
			if(string4=="Yes"||string4=="yes"||string4=="Y"||string4=="y"){
			System.out.println("How much would you like to bet(You have "+money+" dollars): ");
			integer1 = scanner1.nextInt();
			}
		}
		if(random1==random2&&random1==random3&&random2==random3){
			money = money-integer1;
			integer1 = money *3;
			money = money+integer1;
			System.out.println("You got a three numbers the same! You triple your money!");
			System.out.println("You now have "+money+" dollars!");
			System.out.println("Would you like to play(Yes,yes,Y,y): ");
			String string5 = scanner1.nextLine();
			if(string5=="Yes"||string5=="yes"||string5=="Y"||string5=="y"){
			System.out.println("How much would you like to bet(You have "+money+" dollars): ");
			integer1 = scanner1.nextInt();
			}
		}
		if(random1!=random2&&random2!=random3){
			System.out.println("You got no pairs.");
			money = money-integer1;
			System.out.println("You now have "+money+" dollars.");
			System.out.println("Would you like to play(Yes,yes,Y,y): ");
			String string6 = scanner1.nextLine();
			if(string6=="Yes"||string6=="yes"||string6=="Y"||string6=="y"){
			System.out.println("How much would you like to bet(You have "+money+" dollars): ");
			integer1 = scanner1.nextInt();
			}
		if(money==0){
			System.out.println("You ran out of money! Thanks for playing!");
			break;
		}
		}
	}
	}
}
