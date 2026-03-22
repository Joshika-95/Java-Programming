import java.util.Scanner;
public class ProductPriceDiscountCalculator {
    public static void main(String[] args) {
        Scanner p8=new Scanner(System.in);
        int n=p8.nextInt();
        int discount=0;
        double originalTotal=0;
        double finalTotal=0;
        int totalItems=0;
        for(int i=0;i<n;i++){
            String productName=p8.next();
            double price=p8.nextDouble();
            int quantity=p8.nextInt();
            if(quantity==1){
                discount=0;
            }
            else if(quantity>=2 && quantity<=4){
                discount=10;
            }
            else if(quantity>=5 && quantity<=9){
                discount=15;
            }
            else {
                discount=20;
            }
            double originalPrice=price*quantity;
            double subtotal=originalTotal*(1-discount/100.0);
            originalTotal+=originalPrice;
            finalTotal+=subtotal;
            totalItems+=quantity;
            System.out.println("Product: "+productName);
            System.out.println("Unit Price: $"+price);
            System.out.println("Quantity: "+quantity);
            System.out.println("Discount: "+discount+"%");
            System.out.println("Subtotal: $"+subtotal);
        }
        double totalDiscount=originalTotal-finalTotal;
        double savings=(totalDiscount/originalTotal)*100;
        System.out.println("Total Items: "+totalItems);
        System.out.println("Original Total: $"+originalTotal);
        System.out.println("Total Discount: $"+totalDiscount);
        System.out.println("Final Total: $"+finalTotal);
        System.out.println("Savings: "+savings+"%");
    }
}
