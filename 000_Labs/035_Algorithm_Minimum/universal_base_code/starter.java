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
		int [] arr = new int[(int)(Math.random()*149)+51];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int avg = Integer.MAX_VALUE;
		for(int i= 0; i<arr.length; i++){
			int int2 = (int)(Math.random()*100)+1;
			arr[i] = int2;
			System.out.println(arr[i]);
		}
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
			min = arr[i];
			}
		}
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < avg){
				int sum = 0;
				while(true){
					avg = avg+arr[i];
					if(arr[i]<avg){
						break;
					}
				}
				sum = avg/arr.length;
			}
		}
		System.out.println("The minimum is : "+min);
		System.out.println("The maximum is : "+max);
		System.out.println("The average is: "+avg);
		System.out.println("There are "+arr.length+" elements");
	}
}
