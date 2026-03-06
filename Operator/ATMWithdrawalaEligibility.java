import java.util.Scanner;
public class ATMWithdrawalEligibility {
    public static void main(String[] args) {
        Scanner s2=new Scanner(System.in);
        int accBal=s2.nextInt();
        int withdrawlAmot=s2.nextInt();
        int dailyLimit=s2.nextInt();
        if(withdrawlAmot<=accBal && withdrawlAmot<=dailyLimit){
            System.out.print("Transaction Approved");
        }
        else{
            System.out.print("Transaction Declined");
        }
        }
    }


