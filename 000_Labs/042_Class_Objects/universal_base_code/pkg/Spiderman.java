/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class Spiderman {
	String name = "None";
	int age = 0;
	String villain = "None";
	String str2 = "";
	String str3 = "";
	public Spiderman() {
	name = "Miles Morales";
	age = 13;
	villain = "King Pin";
	}
	public Spiderman(String name){
		this.name = name;
	}
	public Spiderman(String name,int age){
		this.name = name;
		this.age = age;
	}
	public Spiderman(String name,String villain){
		this.name = name;
		this.villain = villain;
	}
	public void print(){
		str2 = "The actor " + name + " is " + age + " years old.";
		str3 = "They play Spiderman who's villain is "+ villain;
		System.out.println("--------------------------------------------------");
		System.out.println(str2);
		System.out.println(str3);
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setVillain(String villain){
		this.villain = villain;
	}
	
}

