/* 
    Lecture note example - If Statements
*/import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You get lost in a forest.");
        System.out.print("You have 3 paths to choose, which one do you choose 1,2, or 3: ");
        int num1 = sc.nextInt();
        while(true){
        if(num1==1){
            System.out.println("You go down the path and find a weird old house, you hear nothing but do see a faint purple light, do you enter: Y/N");
            String str1 = sc.nextLine();
            if(str1=="Y"){
                System.out.println("You enter the old house and you see an old looking person and ask them where they are and take a step forward, next thing you know a trapdoor opens up underneath you.");
                System.out.println("You died.");
            }
        }
        if(num1==2){
            System.out.println("You go down the path and see a small village with few people outside, do you go through the village: Y/N");
            String str2 = sc.nextLine();
            if(str2=="Y"){
                System.out.println("You enter the town and find a house for lease but you ignore it, you walk by an alley way and see someone in a black hoodie, you walk down the alley way, out of curiosity, and they dont say anything and hand you a small book, you open it and the next thing you know something rushes through your body, you dont know what happened, and the man is gone. You were given a curse that you never can move your legs again.");
            }
        }
        if(num1==3){
            System.out.println("You go down the path and you have to go through a swamp, while walking through it your foot gets stuck, you notice some people walk by, do you call for help:Y/N");
            String str3 = sc.nextLine();
            if(str3=="Y"){
                System.out.println("You call out for the people but they cant hear you, you call louder and they still cant hear you, next thing you know youve been grabbed by the leg thats stuck and drown");
                System.out.println("You died.");
            }
        }
        else{
            System.out.println("Please choose 1,2, or 3");
        }
    }
    }
}