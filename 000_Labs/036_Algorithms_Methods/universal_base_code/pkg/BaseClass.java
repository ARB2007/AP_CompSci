/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int sum = 0;
	public static void toStringArray(int[] a){
		int [] arr = new int[100];
			for(int i= 0; i<arr.length; i++){
			int int2 = (int)(Math.random()*100)+1;
			arr[i] = int2;
			System.out.println(arr[i]);
		}
		System.out.println("There are "+arr.length+" elements");
	}
	public static void getArrayAverage(int[] b){
		int avg = Integer.MAX_VALUE;
		int [] arr = new int[100];
		int sum = 0;
			for(int i= 0; i<arr.length; i++){
			int int2 = (int)(Math.random()*100)+1;
			arr[i] = int2;
			//System.out.println(arr[i]);
		}
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < avg){
				while(true){
					avg = avg+arr[i];
					sum = avg/arr.length;
					if(arr[i]<avg){
						break;
					}
				}
			}
		}
		System.out.println("The average is "+sum);
	}
	public static void getArrayMin(int[] c){
		int min = Integer.MAX_VALUE;
		int [] arr = new int[100];
		for(int i= 0; i<arr.length; i++){
			int int2 = (int)(Math.random()*100)+1;
			arr[i] = int2;
			//System.out.println(arr[i]);
		}
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
			min = arr[i];
			}
		}
		System.out.println("The minimum is "+min);
	}
	public static void getArrayMax(int[] d){
		int max = Integer.MIN_VALUE;
		int [] arr = new int[100];
		for(int i= 0; i<arr.length; i++){
			int int2 = (int)(Math.random()*100)+1;
			arr[i] = int2;
			//System.out.println(arr[i]);
		}
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("The maximum is "+ max);
	}
}

