/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.Scanner;
public class starter{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a sentence you want translated into Pig Latin(all lowercase please): ");
		String input = sc.nextLine();
		String newword = "";
		String [] arr = new String[input.length()];
		String [] arr1 = new String[input.length()];
		boolean boo1 = false;
		boolean boo2 = false;
		int i = 0;
		while(i<input.length()){
		    char char1 = input.charAt(i);
            if(char1==' '||i==input.length()-1){
                if(char1!=' '){
                    newword = newword+char1;
                }

                if(!newword.isEmpty()){
                    if(boo1){
                        System.out.print(newword + "-way ");
                    } 
                    else{
                        System.out.print(newword.substring(1) + "-" + newword.charAt(0) + "ay ");
                    }
                }
                newword = "";
                boo1 = false;
            } 
            else{
                if(newword.isEmpty() && (char1=='a'||char1=='e'||char1=='i'||char1=='o'||char1=='u')) {
                    boo1 = true;
                }
                newword += char1;
            }

            i++;
        }
	}
}