/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("The days are Sunday(0),Monday(1),Tuesday(2),Wednesday(3),Thursday(4),Friday(5),Saturday(6)");
	System.out.print("What day is it: ");
	int int1 = sc.nextInt();
	if(int1==1||int1==2||int1==3||int1==4||int1==5){
	System.out.println("ITS TIME TO WAKE UP, ITS 7 AM AND YOU HAVE SCHOOL!");
	}
	else if(int1==0||int1==6){
		System.out.println("Hey its time to wake up, its 10am on the weekend.");
	}
}
}
