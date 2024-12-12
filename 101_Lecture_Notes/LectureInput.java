/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    //int int1;
    System.out.println("Please enter a name: ");
    String name1 = sc.nextLine();
    System.out.println("What is your favorite food: ");
    String food1 = sc.nextLine();
    System.out.println("Please enter a number: ");
    int int1 = sc.nextInt();
    System.out.println("Please enter another number: ");
    int int2 = sc.nextInt();
    
    System.out.println("Hello "+name1);
    System.out.println("The sum of int1 and int2 are: "+(int1+int2));
    System.out.println("Your favorite food is: "+food1);
	}
}