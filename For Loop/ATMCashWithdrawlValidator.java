import java.util.Scanner;
public class ATMCashWithdrawlValidator {
    public static void main(String[] args) {
        Scanner p6=new Scanner(System.in);
        double initialBal=p6.nextDouble();
        int n=p6.nextInt();
        int successCount=0;
        int failureCount=0;
        double totalWithdrawl=0;
        for(int i=1;i<=n;i++){
            double withdrawlAmot=p6.nextDouble();
            System.out.println("Transaction "+i+": $"+withdrawlAmot);
            if(withdrawlAmot<=initialBal){
                initialBal-=withdrawlAmot;
                totalWithdrawl+=withdrawlAmot;
                successCount++;
                System.out.println("Status: Approved");
                System.out.println("Remaining Balance: $"+initialBal);
            }
            else {
                failureCount++;
                System.out.println("Status: Denied");
                System.out.println("Reason: Insufficient funds");
                System.out.println("Remaining Balance: $"+initialBal);
            }
            System.out.println();
        }
        System.out.println("Total Transactions: "+n);
        System.out.println("Successful Withdrawals: "+successCount);
        System.out.println("Failed Withdrawals: "+failureCount);
        System.out.println("Final Balance: $"+initialBal);
        System.out.println("Total Withdrawn: $"+totalWithdrawl);
    }
}
