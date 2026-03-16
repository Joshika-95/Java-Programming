import java.util.Scanner;
public class MovieTicketPricing {
    public static void main(String[] args) {
        Scanner p19=new Scanner(System.in);
        String movieFormat=p19.next();
        String time=p19.next();
        String category=p19.next();
        String customerType=p19.next();
        double ticketPrice=0;
        double surcharge=0;
        double fee=0;
        double adjustment=0;
        double discount=0;
        String pricingCategory="";
        String voucher="";
        if(movieFormat.equals("2D")){
            ticketPrice=12;
            surcharge=0;
        }
        else if(movieFormat.equals("3D")){
            ticketPrice=12;
            surcharge=5;
        }
        else if(movieFormat.equals("IMAX")){
            ticketPrice=12;
            surcharge=8;
        }
        else if(movieFormat.equals("4DX")){
            ticketPrice=12;
            surcharge=10;
        }
        if(category.equals("Standard")){
            fee=0;
        }
        else if(category.equals("Premium")){
            fee=4;
        }
        else if(category.equals("Recliner")){
            fee=7;
        }
        if(time.equals("Matinee")){
            adjustment=-30;
        }
        else if(time.equals("Evening")){
            adjustment=0;
        }
        else if(time.equals("Prime-Time")){
            adjustment=+20;
        }
        else if(time.equals("Late-Night")){
            adjustment=-20;
        }
        if(customerType.equals("Adult")){
            discount=0;
        }
        else if(customerType.equals("Senior")){
            discount=25;
        }
        else if(customerType.equals("Student")){
            discount=15;
        }
        else if(customerType.equals("Child")){
            discount=30;
        }
        double baseSurcharges=ticketPrice+surcharge+fee;
        double adjustedPrice=baseSurcharges*(1+adjustment/100.0);
        double finalPrice=adjustedPrice*(1-discount/100.0);
        if(time.equals("Matinee") || (customerType.equals("Senior")) || (customerType.equals("Student")) || (customerType.equals("Child"))){
            voucher="Yes";
        }
        else {
            voucher="No";
        }
        if(finalPrice>=5 && finalPrice<=10){
            pricingCategory="Value";
        }
        else if(finalPrice>=20 && finalPrice<=25){
            pricingCategory="Premium";
        }
        else{
            pricingCategory="Luxury";
        }
        System.out.println("Movie Format: "+movieFormat);
        System.out.println("Show Time: "+time);
        System.out.println("Seat Category: "+category);
        System.out.println("Customer Type: "+customerType);
        System.out.println("Base Ticket Price: $"+ticketPrice);
        System.out.println("Format Surcharge: $"+surcharge);
        System.out.println("Seat Upgrade Fee: $"+fee);
        System.out.println("Time-Based Adjustement: "+adjustment+"%");
        System.out.println("Customer Discount: "+discount+"%");
        System.out.println("Final Ticket Price: $"+finalPrice);
        System.out.println("Concession Voucher: "+voucher);
        System.out.println("Pricing Category: "+pricingCategory);
    }
}
    

