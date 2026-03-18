import java.util.Scanner;
public class InventoryStockManagement {
    public static void main(String[] args) {
        Scanner p3=new Scanner(System.in);
        int n=p3.nextInt();
        int lowStock=0;
        int critical=0;
        int totalRecord=0;
        for(int i=0;i<n;i++){
            String productName=p3.next();
            int stock=p3.nextInt();
            int mimStock=p3.nextInt();
            String status="";
            int quantity=0;
            if(stock>=mimStock){ 
                status="Adequate";
                quantity=0;
            }
            else if(stock<mimStock && stock>=mimStock/2){
                status="Low Stock";
                quantity=(mimStock-stock)+mimStock/2;
                lowStock++;
            }
            else if(stock<mimStock/2){
                status="Critical";
                quantity=(mimStock-stock)+(int)(mimStock*1.5);
                critical++;
            }
            totalRecord+=quantity;
            System.out.println("Product: "+productName);
            System.out.println("Current Stock: "+stock);
            System.out.println("Minimum Stock: "+mimStock);
            System.out.println("Status: "+status);
            System.out.println("Record Quantity: "+quantity);
        }
        System.out.println("Total Product: "+n);
        System.out.println("Low Stock Items: "+lowStock);
        System.out.println("Critical Items: "+critical);
        System.out.println("Total Record Quantity: "+totalRecord);
    }  
}
