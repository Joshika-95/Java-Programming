import java.util.Scanner;
public class VehicleInsurancePremium {
    public static void main(String[] args) {
        Scanner p12=new Scanner(System.in);
        int driverAge=p12.nextInt();
        String vehicleType=p12.next();
        String drivingRecord=p12.next();
        String coverageLevel=p12.next();
        int base=0;
        double ageFactor=0;
        double riskFactor=0;
        double adjustment=0;
        if(coverageLevel.equals("Basic")){
            base=500;
        }
        else if(coverageLevel.equals("Standard")){
            base=800;
        }
        else if(coverageLevel.equals("Comprehensive")){
            base=1500;
        }
        if(driverAge>=16 && driverAge<=21){
            ageFactor=1.8;
        }
        else if(driverAge>=22 && driverAge<=25){
            ageFactor=1.5;
        }
        else if(driverAge>=26 && driverAge<=40){
            ageFactor=1.0;
        }
        else if(driverAge>=41 && driverAge<=60){
            ageFactor=0.9;        
        }
        else if(driverAge>=61){
            ageFactor=1.1;
        }
        if(vehicleType.equals("Sedan")){
            riskFactor=1.0;
        }
        else if(vehicleType.equals("SUV")){
            riskFactor=1.2;
        }
        else if(vehicleType.equals("Sports")){
            riskFactor=1.5;
        }
        else if(vehicleType.equals("Truck")){
            riskFactor=1.1;
        }
        if(drivingRecord.equals("Clean")){
            adjustment=-10;
        }
        else if(drivingRecord.equals("Minor-Violations")){
            adjustment=+25;
        }
        else if(drivingRecord.equals("Major-Violation")){
            adjustment=+50;
        }
        double adjustedPremium=base*ageFactor*riskFactor;
        double finalPremium=adjustedPremium*(1+adjustment/100);
        double monthlyPremium=finalPremium/12;
        System.out.println("Driver Age: "+driverAge);
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Driving Record: "+drivingRecord);
        System.out.println("Coverage Level: "+coverageLevel);
        System.out.println("Base Premium: $"+base);
        System.out.println("Age Factor: "+ageFactor+"x");
        System.out.println("Vehicle Risk Factor: "+riskFactor+"x");
        System.out.println("Record Adjustment: "+adjustment+"%");
        System.out.println("Monthly Premium: $"+monthlyPremium);
        System.out.println("Annual Premium: $"+finalPremium);
    }
}

    

