import java.util.Scanner;
public class LoanApprovalEligibility {
    public static void main(String[] args) {
        Scanner s5=new Scanner(System.in);
        int salary=s5.nextInt();
        int creditScore=s5.nextInt();
        if(salary>25000 && creditScore>700){
            System.out.print("Loan Approved");
        }
        else{
            System.out.print("Loan Rejected");
        }
    }
    
}
