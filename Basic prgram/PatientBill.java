import java.util.Scanner;
public class PatientBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double roomCharge=sc.nextDouble();
        double days=sc.nextDouble();
        double medicineCost=sc.nextDouble();
        double labFees=sc.nextDouble();
        double insuranceCoverage=sc.nextDouble();
        double finalBill=(roomCharge*days)+medicineCost+labFees-insuranceCoverage;
        System.out.print("Payable Amount: "+finalBill);
    }
    
}
