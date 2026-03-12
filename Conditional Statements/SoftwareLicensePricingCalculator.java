import java.util.Scanner;
public class SoftwareLicensePricingCalculator {
    public static void main(String[] args){
        Scanner p15=new Scanner(System.in);
        int count=p15.nextInt();
        String licenseType=p15.next();
        String supportLevel=p15.next();
        int years=p15.nextInt();
        double basePrice=0;
        int discount=0;
        double supportFee=0;
        int yearDiscount=0;
        String tier="";
        if(licenseType.equals("Standard")){
            basePrice=60;
        }
        else if(licenseType.equals("Professional")){
            basePrice=120;
        }
        else if(licenseType.equals("Enterprise")){
            basePrice=200;
        }
        if(count>=1 && count<=50){
            discount=0;
        }
        else if(count>=51 && count<=200){
            discount=15;
        }
        else if(count>=201 && count<=500){
            discount=20;
        }
        else if(count>=501 && count<=1000){
            discount=25;
        }
        else if(count>=1001){
            discount=35;
        }
        if(supportLevel.equals("Basic")){
            supportFee=10;
        }
        else if(supportLevel.equals("Priority")){
            supportFee=30;
        }
        else if(supportLevel.equals("Premium")){
            supportFee=80;
        }
        if(years==1){
            yearDiscount=0;
        }
        else if(years==2){
            yearDiscount=5;
        }
        else if(years==3){
            yearDiscount=10;
        }
        else if(years==5){
            yearDiscount=20;
        }
        double discountBase=basePrice*(1-discount/100.0);
        double annualPerUser=(discountBase+supportFee)*(1-yearDiscount/100.0);
        double totalAnnual=annualPerUser*count;
        double contractValue=totalAnnual*years;
        if(count<200){
            tier="Small Business";
        }
        else if(count>=200 && count<=1000){
            tier="Mid-Market";
        }
        else if(count>1000){
            tier="Enterprise";
        }
        System.out.println("User Count: "+count);
        System.out.println("License Type: "+licenseType);
        System.out.println("Support Level: "+supportLevel);
        System.out.println("Contract Duration: "+years+"years");
        System.out.println("Base Price Per User: $"+basePrice);
        System.out.println("Volume Discount: "+discount+"%");
        System.out.println("Support Fee Per User: $"+supportFee);
        System.out.println("Multi-Year Discount: "+yearDiscount+"%");
        System.out.println("Annual Cost Per User: $"+annualPerUser);
        System.out.println("Total Annual Cost: $"+totalAnnual);
        System.out.println("Total Contract Value: $"+contractValue);
        System.out.println("Pricing Tier: "+tier);

    }
    
}
