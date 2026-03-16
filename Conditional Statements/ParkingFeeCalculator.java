import java.util.Scanner;
public class ParkingFeeCalculator {
    public static void main(String[] args) {
        Scanner p21=new Scanner(System.in);
        String zone=p21.next();
        double hours=p21.nextDouble();
        String vehicleType=p21.next();
        String status=p21.next();
        double baseRate=0;
        double premium=0;
        double surchange=0;
        double discount=0;
        double dailyCap=0;
        String category="";
        String applied="";
        if(zone.equals("Downtown")){
            premium=50;
            baseRate=5.00;
            category="Premium";
        }
        else if(zone.equals("Business-District")){
            premium=30;
            baseRate=5.00;
            category="Premium";
        }
        else if(zone.equals("Residential")){
            premium=0;
            baseRate=5.00;
            category="Standard";
        }
        else if(zone.equals("Airport")){
            premium=100;
            baseRate=5.00;
            category="Luxury";
        }
        if(vehicleType.equals("Motocycle")){
            surchange=-2;
        }
        else if(vehicleType.equals("Compact")){
            surchange=0;
        }
        else if(vehicleType.equals("Sedan")){
            surchange=0;
        }
        else if(vehicleType.equals("SUV")){
            surchange=3;
        }
        else if(vehicleType.equals("Oversized")){
            surchange=5;
        }
        double rawFee=(baseRate*(1+premium/100.0)+surchange)*hours;
        if(status.equals("None")){
            discount=0;
        }
        else if(status.equals("Monthly")){
            discount=20;
        }
        else if(status.equals("Annual")){
            discount=25;
        }
        else if(status.equals("VIP")){
            discount=30;
        }
        if(hours>=24){
            applied="Yes";
            if(zone.equals("Downtown")){
                dailyCap=150;
            }
            else if(zone.equals("Business-District")){
                dailyCap=120;
            }
            else if(zone.equals("Residential")){
                dailyCap=60;
            }
            else if(zone.equals("Airport")){
                dailyCap=180;
            }
        }
        else {
            applied="No";
        }
        double finalFee=rawFee*(1-discount/100.0);
        System.out.println("Location Zone: "+zone);
        System.out.println("Parking Duration: "+hours+"hours");
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Membership Status: "+status);
        System.out.println("Base Hourly Rate: $"+baseRate);
        System.out.println("Zone Premeium: "+premium+"%");
        System.out.println("Vehicle Size Surcharge: $"+surchange);
        System.out.println("Membership Discount: "+discount+"%");
        System.out.println("Total Parking Fee: $"+finalFee);
        System.out.println("Daily Cap Applied: "+applied);
        System.out.println("Rate Category: "+category);
    }
}
    

    

