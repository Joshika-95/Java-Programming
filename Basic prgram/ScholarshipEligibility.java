import java.util.Scanner;
public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double tuitionFees=sc.nextDouble();
        double scholarship=sc.nextDouble();
        double examFee=sc.nextDouble();
        double libraryFee=sc.nextDouble();
        double scholarshipAmot=(tuitionFees*scholarship)/100;
        double remainingTuitionFee=tuitionFees-scholarshipAmot;
        double payableFee=remainingTuitionFee+examFee+libraryFee;
        System.err.print("Final Payable Fee: "+payableFee); 
    }
}
