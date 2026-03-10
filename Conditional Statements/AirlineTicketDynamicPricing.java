import java.util.Scanner;
public class AirlineTicketDynamicPricing {
    public static void main(String[] args) {
        Scanner p6=new Scanner(System.in);   
        String bookingClass=p6.next();
        int days=p6.nextInt();
        double seatAvailability=p6.nextDouble();
        String routeType=p6.next();
        double percentage=0;
        String category="Moderate";
        double price=0.0;
        double multiplier=1.0;
        if(bookingClass.equals("Economy")){
            if(routeType.equals("Domestic")){
                price=200;
            }
            else if(routeType.equals("Int-Short")){
                price=500;
            }
            else if(routeType.equals("Int-Long")){
                price=800;
            }
        }
        else if(bookingClass.equals("Business")){
            if(routeType.equals("Domestic")){
                price=600;
            }
            else if(routeType.equals("Int-Short")){
                price=1500;
            }
            else if(routeType.equals("Int-Long")){
                price=2500;
            }
        }
        else if(bookingClass.equals("First")){
            if(routeType.equals("Domestic")){
                price=1000;
            }
            else if(routeType.equals("Int-Short")){
                price=3000;
            }
            else if(routeType.equals("Int-Long")){
                price=5000;
            }
        }
        if(seatAvailability<30 && days<14){
            multiplier=1.8;
            category="High Demand";
        }
        else if(seatAvailability<50 && days<30){
            multiplier=1.5;
            category="High Demand";
        }
        else if(seatAvailability<60 || days>=30 && days<60){
            multiplier=1.0;
            category="Moderate";
        }
        else if(seatAvailability>=60 && days>60){
            multiplier=0.8;
            category="Low Demand";
        }
        double finalPrice=price*multiplier;
        System.out.println("Booking Class: "+bookingClass);
        System.out.println("Days Until Departure: "+days);
        System.out.println("Seats Availability: "+seatAvailability+"%");
        System.out.println("Route Type: "+routeType);
        System.out.println("Base price: $"+price);
        System.out.println("Demand Multiplier: "+multiplier+"x");
        System.out.println("Final Ticket Price: $"+finalPrice);
        System.out.println("Pricing Category: "+category);
    }
}