import java.util.Scanner;
public class CloudStroageSubscriptionCal {
    public static void main(String[] args) {
        Scanner p20=new Scanner(System.in);
        int storageGB=p20.nextInt();
        int count=p20.nextInt();
        String frequency=p20.next();
        String tier=p20.next();
        double storageCost=0;
        double userFee=0;
        double premium=0;
        double supportFee=0;
        String plan="";
        String features="";
        if(storageGB>=10 && storageGB<=100){
            storageCost=storageGB*0.05;
        }
        else if(storageGB>=101 && storageGB<=500){
            storageCost=storageGB*0.04;
        }
        else if(storageGB>=501 && storageGB<=2000){
            storageCost=storageGB*0.03;
        }  
        else if(storageGB>=2001){
            storageCost=storageGB*0.02;
        }
        if(count>=1 && count<=10){
            userFee=count*5;
        }
        else if(count>=11 && count<=50){
            userFee=count*4;
        }
        else if(count>=51){
            userFee=count*3;
        }
        if(frequency.equals("Daily")){
            premium=0;
        }
        else if(frequency.equals("Hourly")){
            premium=15+(0.5*count);
        }
        else if(frequency.equals("Real-Time")){
            premium=50+(1*count);
        }
        if(tier.equals("Community")){
            supportFee=0;
        }
        else if(tier.equals("Standard")){
            supportFee=20;
        }
        else if(tier.equals("Priority")){
            supportFee=75;
        }
        else if(tier.equals("Enterprise")){
            supportFee=200;
        }
        double monthlyTotal=storageCost+userFee+premium+supportFee;
        double annual=monthlyTotal*12*0.9;
        if(count==1){
            plan="Personal";
            features="Basic storage,file sync";
        }
        else if(count>=2 && count<=20){
            plan="Team";
            features="Version history,file sharing,basic analytics";
        }
        else if(count>=21 && count<=100){
            plan="Business";
            features="Advanced sharing,team analytics,priority support";
        }
        else {
            plan="Enterprise";
            features="Advanced security,compliance tools,dedicated support,API access";
        }
        System.out.println("Storage Capacity: "+storageGB+"GB");
        System.out.println("User Count: "+count);
        System.out.println("Backup Frequency: "+frequency);
        System.out.println("Support Tier: "+tier);
        System.out.println("Base Storage Cost: $"+storageCost);
        System.out.println("Per-User Fee: $"+userFee);
        System.out.println("Backup Premium: $"+premium);
        System.out.println("Support Fee: $"+supportFee);
        System.out.println("Monthly Subscription: $"+monthlyTotal);
        System.out.println("Annual Subscription: $"+annual);
        System.out.println("Recommended Plan: "+plan);
        System.out.println("Included Features: "+features);
    }
}
    

