public class StepTracker{
    private double totalSteps = 0;
    private double totalDaysActive = 0;
    private double totalStepsAverage = 0;
    public static void addDailySteps(double steps){
        totalSteps = totalSteps+steps;
    }
    public static int activeDays(double days){
        totalDaysActive = totalDaysActive+days;
        return totalDaysActive;
    }
    public static int averageSteps(){
        totalStepsAverage = totalSteps/totalDaysActive;
        return totalStepsAverage;
    }
}