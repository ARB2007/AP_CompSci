package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
public static void specialSquare(int int1) {
    int int2 = 1; 
    int int5 = 0;
    while(int5 < int1) {
        int square = int2 * int2;
        int sum = 0;
        for (int i = 1; sum < square; i++) {
        	sum += i;
			}
		if(sum == square) {
			System.out.println(square);
			int5++;
			}
		int2++;
		}
	}
}
