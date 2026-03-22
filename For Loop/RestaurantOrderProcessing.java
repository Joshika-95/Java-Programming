import java.util.Scanner;
public class RestaurantOrderProcessing {
    public static void main(String[] args) {
        Scanner p10=new Scanner(System.in);
        int n=p10.nextInt();
        double orderSubtotal=0;
        double totalItemCount=0;
        for(int i=0;i<n;i++){
            String itemName=p10.next();
            double price=p10.nextDouble();
            int qty=p10.nextInt();
            double subtotal=price*qty;
            orderSubtotal+=subtotal;
            totalItemCount+=qty;
            System.out.println("Item: "+itemName);
            System.out.println("Price: $"+price);
            System.out.println("Subtotal: $"+subtotal);
            System.out.println();
        }
        double tax=orderSubtotal*0.08;
        double charge=orderSubtotal*0.10;
        double grandTotal=orderSubtotal+tax+charge;
        System.out.println("Total Items: "+totalItemCount);
        System.out.println("Subtotal: $"+orderSubtotal);
        System.out.println("Tax(8%): $"+tax);
        System.out.println("Service Charge(10%): $"+charge);
        System.out.println("Grand Total: $"+grandTotal);
    }  
}
