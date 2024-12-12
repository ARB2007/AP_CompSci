/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int[21];
		int [] arr1 = new int[21];
		int int4 = 0;
		int int5 = 0;
		int int6 = (int)(Math.random()*10)+1;
		int int7 = 0;
		for(int i = 1; i<arr.length; i++){
			int int2 = (int)(Math.random()*10)+1;
			arr[i] = int2;
			arr1[i] = int2;
			System.out.println(arr[i]);
			if(arr[i]==int6&&arr[i-1]==int6){
				int7++;
			}
			if(arr1[int4]==int6){
				int5++;
			}
			int4++;
		}
		System.out.println("There are "+int5+" duplicates");
		System.out.println(int7+" consecutives");
		System.out.println("The number is: "+int6);
	}
}
