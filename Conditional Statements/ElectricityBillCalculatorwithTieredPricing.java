import java.util.Scanner;
public class ElectricityBillCalculatorwithTieredPricing {
    public static void main(String[] args) {
        Scanner p22=new Scanner(System.in);
        int consumed=p22.nextInt();
        String customerType=p22.next();
        String season=p22.next();
        String payment=p22.next();
        double tierCost=0;
        double adjustment=0;
        double discount=0;
        double rate1=0,rate2=0,rate3=0,rate4=0;
        double tier1=0,tier2=0,tier3=0,tier4=0;
        if(customerType.equals("Residential")){
            rate1=0.10;
            rate2=0.15;
            rate3=0.25;
            rate4=0.30;
        }
        else if(customerType.equals("Commercial")){
            rate1=0.12;
            rate2=0.18;
            rate3=0.25;
            rate4=0.25;
        }
        else if(customerType.equals("Industrial")){
            rate1=0.08;
            rate2=0.12;
            rate3=0.20;
            rate4=0.20;
        }
        if(consumed>=0 && consumed<=100){
            tier1=consumed*rate1;
        }
        else if(consumed>=101 && consumed<=300){
            tier1=100*rate1;
            tier2=(consumed-100)*rate2;
        }
        else if(consumed>=301 && consumed<=500){
            tier1=100*rate1;
            tier2=200*rate2;
            tier3=(consumed-300)*rate3;
        }
        else{
            tier1=100*rate1;
            tier2=200*rate2;
            tier3=200*rate3;
            tier4=(consumed-500)*rate4;
        }
        double total=tier1+tier2+tier3+tier4;
        if(season.equals("Summer")){
            adjustment=0.15;
        }
        else if(season.equals("Winter")){
            adjustment=0.10;
        }
        else if(season.equals("Regular")){
            adjustment=0.0;
        }
        double afterSeason=total+(total*adjustment);
        if(payment.equals("Auto-Pay")){
            discount=5;
        }
        else if(payment.equals("Online")){
            discount=3;
        }
        else if(payment.equals("Manual")){
            discount=0;
        }
        double discountAmount=afterSeason*discount;
        double totalBill=afterSeason-discountAmount; 
        double averageRate=totalBill/consumed;
        System.out.println("Units Consumed: "+consumed+ "kWh");
        System.out.println("Customer Type: "+customerType);
        System.out.println("Season: "+season);
        System.out.println("Payment Method: "+payment);
        System.out.println("Tier 1 Cost(0-100): $"+tier1);
        System.out.println("Tier 2 Cost(101-300): $"+tier2);
        System.out.println("Tier 3 Cost(301-500): $"+tier3);
        System.out.println("Tier 4 Cost(501+): $"+tier4);
        System.out.println("Seasonal Adjustment: "+(adjustment*100)+"%");
        System.out.println("Payment Discount: "+(discount*100)+"%");
        System.out.println("Total Bill: $"+totalBill);
        System.out.println("Average Rate: $"+averageRate);
    }
}


    
