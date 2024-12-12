/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String text1= new String();
	String text2= new String();
	String text3= new String();
	String text4= new String();
	String text5= new String();
	String text6= new String();
	//String text7= new String();
		System.out.println("What is your first name: "); 
		text1 = sc.nextLine();
		System.out.println("How old are you: ");
		text2 = sc.nextLine();
		System.out.println("Whats your Birth month: ");
		text3 = sc.nextLine();
		System.out.println("What day were you born: ");
		text4 = sc.nextLine();
		System.out.println("What year were you born: ");
		text5 = sc.nextLine();
		System.out.println("How much is a buck fifty: ");
		text6 = sc.nextLine();
		System.out.println("The users name is "+text1+", is "+text2+" years old, was born on "+text3+" "+text4+" "+text5+" , and they belive a Buck fifty is "+text6+".");
	}
}
