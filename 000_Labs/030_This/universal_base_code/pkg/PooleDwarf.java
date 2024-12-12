/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf{
	private String name;
	private int age;
	public String name2;

	public PooleDwarf() {		// Default Constructor
		name = new String("");
		age = 0;
	}

	public PooleDwarf(String name, int age){
		this.name = name;
		this.age = age;
	}

	/*	Accessor Methods */
	public String getName(String name){
		return name;
	}

	public int getAge(){
	int int10=0;
	return int10;
	}

	/*	Mutator Methods	*/
	public void setName(String name){
		this.name  = name;
	}
	
	public void setAge(String age){
	}

	public boolean isSameName(String name){
		//String doc = "Doc";
		//String name1;
		//name1 = name;
		String name3;
		int int1 = 1;
		if(name == this.name){
		System.out.println(name+" was the Dwarf");
		System.out.println("There was "+int1+ " duplicates");
		int1++;
	}
	return false;
}
}

