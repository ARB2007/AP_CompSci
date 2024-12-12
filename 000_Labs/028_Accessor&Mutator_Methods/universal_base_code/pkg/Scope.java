/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Scope {
	public int int1;
	public int int2;
	public String Dwarf;

	public void Counter(){
	}
	public void Dwarf(){
		int2 = 1;
		while(true){
		int1 = (int)(Math.random()*100);
		//System.out.println("Dwarf "+int2+" is "+int1+" years old.");
		int2 = int2+1;
		if(int2==101){
			break;
		}
		}
	}

}

