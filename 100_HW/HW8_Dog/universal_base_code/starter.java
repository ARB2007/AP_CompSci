/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog Finn = new Dog();
		Dog Lila = new Dog();
		Finn.Age("Finn",5);
		Lila.Breed("Lila","German Shepherd");
		if(Finn.isSleeping()){
			System.out.println(Finn.bark());
			if(Lila.isSleeping()&&Finn.isSleeping()){
			System.out.println("Lila is now awake and "+Lila.bark());
		}
		}
		if(!(Finn.isSleeping())){
			System.out.println("Finn is sleeping");
			if(!(Lila.isSleeping())&&Finn.isSleeping()){
			System.out.println(Lila.bark());
		}
		}
	}
}
