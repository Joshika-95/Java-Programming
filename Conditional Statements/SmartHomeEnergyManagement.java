import java.util.Scanner;
public class SmartHomeEnergyManagement {
    public static void main(String[] args) {
        Scanner p10=new Scanner(System.in);
        String time=p10.next();
        double power=p10.nextDouble();
        double percent=p10.nextDouble();
        String tier=p10.next();
        double baseRate=0;
        double multiplier=1;
        String optimal="Low";
        double savings=0;
        if(tier.equals("Basic")){
            baseRate=0.18;
        }
        else if(tier.equals("Time-of-Use")){
            baseRate=0.15;
        }
        else if(tier.equals("Premium-Green")){
            baseRate=0.12;
        }
        if(time.equals("Peak")){
            if(tier.equals("Time-of-Use")){
                multiplier=1.8;
            }
            else{
                multiplier=1.5;
            }
        }
        else if(time.equals("Off-Peak")){
            if(tier.equals("Time-of-Use")){
                multiplier=0.8;
            }
            else {
                multiplier=1.0;
            }
        }
        else if(time.equals("Super-Off-Peak")){
            if(tier.equals("Premium-Green")){
                multiplier=0.5;
            }
            else {
                multiplier=0.6;
            }
        }
        double credit=(power*percent/100)*baseRate;
        double cost=(power*baseRate*multiplier)-credit;
        if(cost<0){
            cost=0;
        }
        if(time.equals("Peak") && percent<30){
            optimal="Shift high-power appliances to Off-Peak hours";
            savings=power*baseRate*(multiplier-1.0);
        }
        else if(percent>=50 && time.equals("Super-Off-Peak")){
            optimal="Excellent! MAximize appliance use during this period";
        }
        else if(tier.equals("Basic") &&power>20){
            optimal="Consider upgrading to Time-of-Use plan";
            savings=0.75;
        }
        else if(percent>=70 && time.equals("Peak")){
            optimal="Great renewable usage! Minor peak reduction possible";
            savings=1.44;
        }
        else if(time.equals("Off-Peak") && percent<30){
            optimal="Good timing! Consider increasing renewable capacity";
        }
        else {
            optimal="Energy usage is well optimized";
        }
        System.out.println("Time of Day: "+time);
        System.out.println("Power Consumption: "+power+"kWh");
        System.out.println("Renewable Energy: "+percent+"%");
        System.out.println("Rate Tier: "+tier);
        System.out.println("Base Rate: $"+baseRate+"/kWh");
        System.out.println("Rate Multiplier: "+multiplier+"x");
        System.out.println("Renewable Credits: $"+credit);
        System.out.println("Total Cost: $"+cost);
        System.out.println("Optimization Recommendation: "+optimal);
        System.out.println("Potential Savings: $"+savings);
    }
}
    
