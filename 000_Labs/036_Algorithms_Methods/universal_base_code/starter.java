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
		int [] arr = new int[100];
		test.toStringArray(arr);
		test.getArrayAverage(arr);
		test.getArrayMax(arr);
		test.getArrayMin(arr);
	}
}
