import java.util.Scanner;
public class FitnessTrackerCalorieBurnCalculator {
    public static void main(String[] args) {
        Scanner p9=new Scanner(System.in);
        int n=p9.nextInt();
        int totalDuration=0;
        int totalCalories=0;
        for(int i=1;i<=n;i++){
            String exerciseType=p9.next();
            int duration=p9.nextInt();
            int burnCalories=0;
            String intensity="";
            if(exerciseType.equals("Running")){
                burnCalories=duration*10;
                intensity="High";
            }
            else if(exerciseType.equals("Swimming")){
                burnCalories=duration*12;
                intensity="High";
            }       
            else if(exerciseType.equals("Cycling")){
                burnCalories=duration*8;
                intensity="Moderate";
            }
            else if(exerciseType.equals("Gym")){
                burnCalories=duration*7;
                intensity="Moderate";
            }
            else if(exerciseType.equals("Walking")){
                burnCalories=duration*4;
                intensity="Low";
            }
            totalDuration+=duration;
            totalCalories+=burnCalories;
            System.out.println("Session "+i+": "+exerciseType);
            System.out.println("Duration: "+duration+"minutes");
            System.out.println("Calories Burned: "+burnCalories);
            System.out.println("Intensity: "+intensity);
            System.out.println();
        }
        double averageCalories=totalCalories/n;
        String level="";
        if(totalCalories<300){
            level="Beginner";
        }
        else if(totalCalories>=300 && totalCalories<=1000){
            level="Intermediate";
        }
        else{
            level="Advanced";
        }
        System.out.println("Total Workouts: "+n);
        System.out.println("Total Duration: "+totalDuration+"minutes");
        System.out.println("Total Calories Burned: "+totalCalories);
        System.out.println("Average Calories per Session: "+averageCalories);
        System.out.println("Fitness Level: "+level);
    } 
}
