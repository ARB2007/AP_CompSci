import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		int strength1 = 0;
		int strength2 = 0;
		int strength3 = 0;
        for(int e = 0;e<passwords.length;e++){
        String line1 = passwords[e];
        boolean flag1 = false;
        boolean flag2 = false;
        if(line1.length()>=8){
            strength1++;
            flag1 = true;
        }
        if(line1.contains("!")||line1.contains("@")||line1.contains("#")||line1.contains("$")||line1.contains("%")||line1.contains("^")||line1.contains("&")||line1.contains("*")){
            strength2++;
            flag2 = true;
        }
        if(flag1&&flag2){
            strength3++;
        }
        }
        System.out.println("Strength 1 Passwords: "+strength1);
        System.out.println("Strength 2 Passwords: "+strength2);
        System.out.println("Strength 3 Passwords: "+strength3);

	}
}
