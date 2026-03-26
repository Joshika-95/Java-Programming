import java.util.Scanner;
public class BankTransactionAnalyzer {
    public static void main(String[] args) {
        Scanner p20=new Scanner(System.in);
        int n=p20.nextInt();
        double totalDeposit=0;
        double totalWithdrawl=0;
        double totalTransfers=0;
        double totalPayment=0;
        for(int i=1; i<=n; i++){
            String type=p20.next();
            double amount=p20.nextDouble();
            String category="";
            if(type.equals("Deposit")){
                category="Credit";
                totalDeposit+=amount;
            }
            else {
                category="Debit";
                if(type.equals("Withdrawal")){
                    totalWithdrawl+=amount;
                }
                else if(type.equals("Transfer")){
                    totalTransfers+=amount;
                }
                else if(type.equals("Payment")){
                    totalPayment+=amount;
                }
            }
            System.out.println("Transaction"+i+": "+type);
            System.out.println("Amount: $"+amount);
            System.out.println("Category: "+category);
        }
        double netBal=totalDeposit-(totalWithdrawl+totalTransfers+totalPayment);
        System.out.println("Total Transactions: "+n);
        System.out.println("Total Deposits: $"+totalDeposit);
        System.out.println("Total Withdrawals: $"+totalWithdrawl);
        System.out.println("Total Transfers: $"+totalTransfers);
        System.out.println("Total Payments: $"+totalPayment);
        System.out.println("Net Balance Change: $"+netBal);
    }
}
