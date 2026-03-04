import java.util.Scanner;
public class MobileData {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the baseCost: ");
        double baseCost=scan.nextDouble();
        System.out.print("Enter the extraGb: ");
        double extraGb=scan.nextDouble();
        System.out.print("Enter the rate: ");
        double rate=scan.nextDouble();
        System.out.print("Enter the tax: ");
        double tax=scan.nextDouble();
        double extraCost=extraGb*rate;
        double total=baseCost+extraCost;
        double taxAmt=(total*tax)/100;
        double totalBill=total+taxAmt;
        System.out.print("Total Bill: "+totalBill);
    }
    
}
