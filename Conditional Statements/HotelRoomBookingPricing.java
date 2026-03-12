import java.util.Scanner;
public class HotelRoomBookingPricing {
        public static void main(String[] args) {
            Scanner p16=new Scanner(System.in);
            String roomCategory=p16.next();
            String season=p16.next();
            int nightBooked=p16.nextInt();
            String tier=p16.next();
            double baseRate=0;
            double multiplier=0;
            double discount=0;
            double loyaltyDiscount=0;
            String upgrade="";
            if(roomCategory.equals("Standard")){
                baseRate=150;
            }
            else if(roomCategory.equals("Deluxe")){
                baseRate=300;
            }
            else if(roomCategory.equals("Suite")){
                baseRate=500;
            }
            else if(roomCategory.equals("Presidential")){
                baseRate=1000;
            }
            if(season.equals("Off-Peak")){
                multiplier=0.7;
            }
            else if(season.equals("Regular")){
                multiplier=1.0;
            }
            else if(season.equals("Peak")){
                multiplier=1.5;
            }
            else if(season.equals("Holiday")){
                multiplier=2.0;
            }
            if(nightBooked>=1 && nightBooked<=4){
                discount=0;
            }
            else if(nightBooked>=5 && nightBooked<=7){
                discount=5;
            }
            else if(nightBooked>=8 && nightBooked<=14){
                discount=10;
            }
            else if(nightBooked>=15){
                discount=20;
            }
            if(tier.equals("None")){
                loyaltyDiscount=0;
            }
            else if(tier.equals("Member")){
                loyaltyDiscount=10;
            }
            else if(tier.equals("Gold")){
                loyaltyDiscount=15;
            }
            else if(tier.equals("Platinum")){
                loyaltyDiscount=20;
            }
            double seasonalRate=baseRate*multiplier;
            double discountBase=seasonalRate*(1-discount/100.0)*(1-loyaltyDiscount/100.0);
            double totalCost=discountBase*nightBooked;
            if(roomCategory.equals("Standard")){
                if(tier.equals("None")){
                    upgrade="None";
                }
            }
            else if(roomCategory.equals("Deluxe")){
                if(tier.equals("Gold")){
                    upgrade="Free breakfast amd spa access";
                }
                else if(tier.equals("None")){
                    upgrade="None";
                }
            }
            else if(roomCategory.equals("Suite")){
                if(tier.equals("Member")){
                    upgrade="Free breakfast";
                }
            }
            else if(roomCategory.equals("Preidential")){
                if(tier.equals("Platinum")){
                    upgrade="Concierge service,airport transfer,and the dining";
                }
            }
            System.out.println("Room Category: "+roomCategory);
            System.out.println("Season: "+season);
            System.out.println("Nights Booked: "+nightBooked);
            System.out.println("Loyalty Tier: "+tier);
            System.out.println("Base Rate Per Night: $"+baseRate);
            System.out.println("Seasonal Multiplier: "+multiplier+"x");
            System.out.println("Extended Stay Discount: "+discount+"%");
            System.out.println("Loyalty Discount: "+loyaltyDiscount+"%");
            System.out.println("Nightly Rate: $"+discountBase);
            System.out.println("Total Booking Cost: $"+totalCost);
            System.out.println("Complimentary Upgrade: "+upgrade);
        }
        
}
