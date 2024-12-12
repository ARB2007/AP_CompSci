/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        printAnimal();
        greeting("Spike");
        double num = raise(200000.42,5);
        System.out.println(num);
        num = raise(num,5);
        System.out.println(num);
        num = raise(num,5);
        System.out.println(num);
	}
	public static double raise(double salary,int percent){
	    double amount = salary+(salary*(percent/100.0));
	    return amount;
	}
	public static void greeting(String name){
	    System.out.println("Hey "+name+", how is your day going so far.");
	}
	public static void printAnimal(){
	    System.out.println("---===e");
	}
	
}