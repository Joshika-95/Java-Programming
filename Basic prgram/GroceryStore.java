import java.util.Scanner;
public class GroceryStore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the salesAmt: ");
        double salesAmt=sc.nextDouble();
        System.out.print("Enter the discount: ");
        double discount=sc.nextDouble();
        System.out.print("Enter the gst: ");
        double gst=sc.nextDouble();
        double discountAmt=(salesAmt*discount)/100;
        double amtAfterDiscount=salesAmt-discountAmt;
        double gstAmt=(amtAfterDiscount*gst)/100;
        double finalRevenue=amtAfterDiscount+gstAmt;
        System.out.print("Final Revenue= "+finalRevenue);
    }
}

