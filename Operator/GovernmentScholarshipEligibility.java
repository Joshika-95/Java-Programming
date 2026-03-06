import java.util.Scanner;
public class GovernmentScholarshipEligibility {
    public static void main(String[] args) {
        Scanner s6=new Scanner(System.in);
        int familyIncome=s6.nextInt();
        int percentage=s6.nextInt();
        if(familyIncome<200000 && percentage>=75){
            System.out.print("Scholarship Granted");
        }
        else{
            System.out.print("Not Granted");
        }
    }
    
}
