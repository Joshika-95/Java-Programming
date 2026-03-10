import java.util.Scanner;
public class ECommerceDynamicDiscount {
    public static void main(String[] args) {
        Scanner p4=new Scanner(System.in);
        String tire=p4.next();
        double cartValue=p4.nextDouble();
        String category=p4.next();
        String status=p4.next();
        int additionalDiscount=0;
        int baseDiscount=0;
        if(tire.equals("Bronze")){
            baseDiscount=5;
        }
        else if(tire.equals("Silver")){
            baseDiscount=8;
        }
        else if(tire.equals("Gold")){
            baseDiscount=12;
        }
        else if(tire.equals("Platinum")){
            baseDiscount=15;
        }
        if(cartValue>=500 && cartValue<=999){
            additionalDiscount+=3;
        }
        else if (cartValue>=1000 && cartValue<=1999){
            additionalDiscount+=5;
        }
        else if(cartValue>=2000){
            additionalDiscount+=7;
        }
        if(category.equals("Electronics")){
            if(status.equals("Prime")){
                additionalDiscount+=5;
            }
        }
        else if(category.equals("Fashion")){
            additionalDiscount+=3;
        }
        else if(category.equals("Books")){
            if(status.equals("Prime")){
                additionalDiscount+=5;
            }
        }
        else if(category.equals("Groceries")){
            if(cartValue>300){
                additionalDiscount+=2;
            }
        }
        int totalDiscount=baseDiscount+additionalDiscount;
        double finalPrice=cartValue*(1-totalDiscount/100.0);
        double savings=cartValue-finalPrice;
        System.out.println("Loyalty Tier: "+tire);
        System.out.println("Cart Value: $"+cartValue);
        System.out.println("Product Category: "+category);
        System.out.println("Membership: "+status);
        System.out.println("Base Discount: "+baseDiscount+"%");
        System.out.println("Additional Discount: "+additionalDiscount+"%");
        System.out.println("Total Discount: "+totalDiscount+"%");
        System.out.println("Final Price: $"+finalPrice);
        System.out.println("Savings: $"+savings);
    }
}

