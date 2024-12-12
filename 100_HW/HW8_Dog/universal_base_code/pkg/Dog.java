package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
		public String name;
		public int age;
		public String breed;
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "Big Red Dog";
	}
	public void Name(String name1){
			name = name1;
			age = 1;
			breed = "dog dog";
		}
		public void Breed(String name2,String breed1){
			name = name2;
			breed = breed1;
			age = 1;
		}
		public void Age(String name3,int age1){
			name = name3;
			age = age1;
			breed = "dog dog";
		}
		public void setName(String name4){
			name = name4;
		}
		public void setAge(int age2){
			age = age2;
		}
		public void setBreed(String breed2){
			breed = breed2;
		}
		public boolean isSleeping(){
			int random = (int)(Math.random()*50);
			if(random<=25){
				return true;
			}
			else{
				return false;
			}
		}
		public String bark(){
			String return1 = name+" is barking";
			return return1;
		}
}
