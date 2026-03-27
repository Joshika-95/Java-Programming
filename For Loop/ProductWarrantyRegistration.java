import java.util.Scanner;
public class ProductWarrantyRegistration {
    public static void main(String[] args) {
        Scanner p19=new Scanner(System.in);
        int n=p19.nextInt();
        int totalProduct=n;
        int activeCount=0;
        int expiringSoonCount=0;
        int expiredCount=0;
        for(int i=0; i<n; i++){
            String productID=p19.next();
            String productType=p19.next();
            int purchase=p19.nextInt();
            int warranty=0;
            if(productType.equals("Electronics")){
                warranty=12;
            }
            else if(productType.equals("Appliance")){
                warranty=24;
            }
            else if(productType.equals("Computer")){
                warranty=36;
            }
            int remaining=warranty-purchase;
            if(remaining<0){
                remaining=0;
            }
            String status="";
            if(remaining==0){
                status="Expired";
                expiredCount++;
            }
            else if(remaining>=1 && remaining<=3){
                status="Expiring Soon";
                expiringSoonCount++;
            }
            else if(remaining>3){
                status="Active";
                activeCount++;
            }
            System.out.println("Product ID: "+productID);
            System.out.println("Type: "+productType);
            System.out.println("Warranty Period: "+warranty+" months");
            System.out.println("Months Used: "+purchase);
            System.out.println("Remaining: "+remaining+" months");
            System.out.println("Status: "+status);
            System.out.println();
        }
        System.out.println("Total Products: "+totalProduct);
        System.out.println("Active Warranties: "+activeCount);
        System.out.println("Expiring Soon: "+expiringSoonCount);
        System.out.println("Expired Warranties: "+expiredCount);
    } 
}
