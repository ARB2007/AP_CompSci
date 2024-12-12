package pkg;

public class Movie{
    String movieName;
    double Rating;
    int numRatings;
    int revenue;
    public Movie(){
        movieName = "Avengers";
        Rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    public Movie(String a,double b,int c,int d){
        movieName = a;
        Rating = b;
        numRatings = c;
        revenue = d;
    }
    public void movieToString(){
        System.out.println("Movie:"+movieName);
        System.out.println("Rating: "+Rating);
        System.out.println("Number of Ratings: "+numRatings);
        System.out.println("Revenue: "+revenue);
        System.out.println("                            ");
    }
    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return revenue;
    }
    public double getRating(){
        return Rating;
    }
    public void addRating(double addRate){
        Rating = ((Rating*numRatings)+addRate);
        numRatings++;
        Rating = Rating/numRatings;
        //Rating = ((Rating*numRatings)+addRate)/numRatings;
    }
    public boolean compareRatings(Movie y){
        double z = y.getRating();
        
        if(Rating > z){
            return true;
        }
        else{
            return false;
        }
    }
}
