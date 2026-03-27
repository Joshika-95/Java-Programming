import java.util.Scanner;
public class TaxiFareCalculator {
    public static void main(String[] args) {
        Scanner p15=new Scanner(System.in);
        int n=p15.nextInt();
        double totalDiscount=0;
        double toatalRevenue=0;
        for(int i=1;i<=n;i++){
            double distance=p15.nextDouble();
            String timeOfDay=p15.next();
            double baseFare=3.00;
            double distanceCharge=distance*1.00;
            double timeSurcharge=0;
            if(timeOfDay.equals("Morning")){
                timeSurcharge=0;
            }
            else if(timeOfDay.equals("Afternoon")){
                timeSurcharge=0;
            }
            else if(timeOfDay.equals("Evening")){
                timeSurcharge=3;
            }
            else if(timeOfDay.equals("Night")){
                timeSurcharge=5;
            }
            double totalFare=baseFare+distanceCharge+timeSurcharge;
            totalDiscount+=distance;
            toatalRevenue+=totalFare;
            System.out.println("Ride "+i);
            System.out.println("Distance: "+distance+" km");
            System.out.println("Time: "+timeOfDay);
            System.out.println("Base Fare: $"+baseFare);
            System.out.println("Distance Charge: $"+distanceCharge);
            System.out.println("Time Surcharge: $"+timeSurcharge);
            System.out.println("Total Fare: $"+totalFare);
        }
        double averageFare=toatalRevenue/n;
        System.out.println("Total Rides: "+n);
        System.out.println("Total Distance: "+totalDiscount+" km");
        System.out.println("Total Revenue: $"+toatalRevenue);
        System.out.println("Average Fare: $"+averageFare);
    }  
}
