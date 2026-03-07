import java.util.Scanner;
public class FreeShippingEligibility {
    public static void main(String[] args) {
        Scanner s7=new Scanner(System.in);
        int cartValue=s7.nextInt();
        int premiumMember=s7.nextInt();
        if(cartValue>999 || premiumMember==1){
            System.out.print("Free Shipping");
        }
        else{
            System.out.print("Shipping Charges Applied");
        }
    }
}
