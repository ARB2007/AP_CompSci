/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] num1 = new int[1001];
		 num1[0] = 3;
		 for(int i = 1;i<num1.length;i++){
		 	num1[i] = num1[i-1]+3;
		 	System.out.println(num1[i]);
		 }
		 int [] num3 = new int[1001];
		 num3[0] = 1000;
		 for(int e = 1;e<num3.length;e++){
		 	num3[e] = num3[e-1]-1;
		 	System.out.println(num3[e]);
		 }
	}
}
