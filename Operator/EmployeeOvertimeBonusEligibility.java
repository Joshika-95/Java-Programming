import java.util.Scanner;
public class EmployeeOvertimeBonusEligibility {
    public static void main(String[] args) {
        Scanner s3=new Scanner(System.in);
        int workingHours=s3.nextInt();
        int attendancePercentage=s3.nextInt();
        if(workingHours>40 && attendancePercentage>90){
            System.out.print("Bonus Eligible");
        }
        else{
             System.out.print("Bonus Not Eligible");
        }
    }
    
}
