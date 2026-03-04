import java.util.Scanner;
public class RestaurantBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double totalBill=sc.nextDouble();
        double service=sc.nextDouble();
        double gst=sc.nextDouble();
        double no_of_people=sc.nextDouble();
        double billAmt=(totalBill*service)/100;
        double afterServiceCharge=totalBill+billAmt;
        double gstAmt=(afterServiceCharge*gst)/100;
        double people=afterServiceCharge+gstAmt;
        double numberOfPeople=people/no_of_people;
        System.out.print("Amount per Person: "+numberOfPeople);
    
    }
    
}
