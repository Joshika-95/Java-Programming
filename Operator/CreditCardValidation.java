import java.util.Scanner;
public class CreditCardValidation {
    public static void main(String[] args) {
        Scanner s4=new Scanner(System.in);
        int creditLimit=s4.nextInt();
        int purchaseAmot=s4.nextInt();
        int cardBlocked=s4.nextInt();  
        // give input(1/0)       
        if(purchaseAmot<=creditLimit && cardBlocked==0){
            System.out.print("Approved");
        }
        else{
            System.out.print("Declined");
        }
    }
    
}
