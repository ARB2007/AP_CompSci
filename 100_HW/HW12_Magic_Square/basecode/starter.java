import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter how many magic squares would you like to see: ");
		int int3 = sc.nextInt();
		CVMath.specialSquare(int3);
		//System.out.println(CVMath.findMid(7,5,6));
	}
}
