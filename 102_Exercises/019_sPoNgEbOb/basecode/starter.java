/*
	Author:
	Date:
*/
import java.util.*;
class starter {
	public static String spongecase(String input){
		String finalword = "";
		String letter = "";
		int setter = input.length()+1;
		for(int i = 0;i<input.length();i++){
			if(i%2==1){
				String grabber1 = input.substring(i,i+1);
				letter = grabber1.toUpperCase();
			}
			if(i%2==0){
				String grabber2 = input.substring(i,i+1);
				letter = grabber2.toLowerCase();
			}
			finalword = finalword + letter;
		}
		return finalword;
	}
	public static void main(String args[]) {
		System.out.print(spongecase("spongebob"));
	}
}