import java.util.Scanner;
public class ParkingFeeCalculator {
    public static void main(String[] args) {
        Scanner p12=new Scanner(System.in);
        int n=p12.nextInt();
        int count=0;
        int toatalRevenue=0;
        for(int i=1;i<=n;i++){
            String vehicleType=p12.next();
            double hours=p12.nextDouble();
            double rate=0;
            double dailyCap=0;
            if(vehicleType.equals("Car")){
                rate=3;
                dailyCap=30;
            }
            else if(vehicleType.equals("Motorcycle")){
                rate=2;
                dailyCap=20;
            }
            else if(vehicleType.equals("Truck")){
                rate=5;
                dailyCap=60;
            }
            else if(vehicleType.equals("Bus")){
                rate=7;
                dailyCap=100;
            }
            double fee=hours*rate;
            boolean capApplied=false;
            if(fee>dailyCap){
                fee=dailyCap;
                capApplied=true;
            }
            if(hours>8){
                count++;
            }
            toatalRevenue+=fee;
            System.out.println("Vehicle "+i+": "+vehicleType);
            System.out.println("Hours Parked: "+hours);
            System.out.println("Hourly Rate: $"+rate);
            System.out.println("Parking Fee: $"+fee);
            System.out.println("Cap Applied: "+(capApplied ? "Yes" : "No"));
        }
        double averageFee=toatalRevenue/n;
        System.out.println("Total Vehicles: "+n);
        System.out.println("Total Revenue: $"+toatalRevenue);
        System.out.println("Average Fee: $"+averageFee);
        System.out.println("Peak Hour Vehicles (>8 hours): "+count);
    }
}
