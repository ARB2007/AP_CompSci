/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int [] arr = new int[1001];
		int int1 = 0;
		int int3 = 0;
		while(int1<1000){
			int int2 = (int)(Math.random()*9);
			arr[int1] = int2;
			System.out.println(arr[int1]);
			int1++;
		}
		
	}
}
