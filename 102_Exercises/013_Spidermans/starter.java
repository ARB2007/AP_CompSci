/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman x = new Spiderman();
		Spiderman y = new Spiderman("Andrew Garfield",41,"Electro");
		Spiderman z = new Spiderman("Tom Holland");
		x.setActor("Tobey Maguire");
		x.setAge(49);
		x.setVillain("Green Goblin");
		//z.Spiderman("Tom Holland");
		z.setAge(28);
		z.setVillain("The Vulture");
		System.out.println(y.getVillain());	
	}
}
