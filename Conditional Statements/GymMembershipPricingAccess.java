import java.util.Scanner;
 public class GymMembershipPricingAccess {
    public static void main(String[] args) {
        Scanner p14=new Scanner(System.in);
        String tier=p14.next();
        int month=p14.nextInt();
        String accessLevel=p14.next();
        String addOns=p14.next();
        double monthlyFee=0;
        int discount=0;
        double accessFee=0;
        double addOnFee=0;
        String category="";
        if(tier.equals("Basic")){
            monthlyFee=40;
        }
        else if(tier.equals("Premium")){
            monthlyFee=80;
        }
        else if(tier.equals("Elite")){
            monthlyFee=120;
        }
        else if(tier.equals("VIP")){
            monthlyFee=150;
        }
        if(month==1){
            discount=0;
        }
        else if(month==6){
            discount=10;
        }
        else if(month==12){
            discount=15;
        }
        else if(month==24){
            discount=25;
        }
        if(accessLevel.equals("Single-Location")){
            accessFee=0;
        }
        else if(accessLevel.equals("Regional")){
            accessFee=20;
        }
        else if(accessLevel.equals("NationWide")){
            accessFee=50;
        }
        if(addOns.equals("None")){
            addOnFee=0;
        }
        else if(addOns.equals("Personal-Training")){
            addOnFee=100;
        }
        else if(addOns.equals("Classes")){
            addOnFee=50;
        }
        else if(addOns.equals("Full-Package")){
            addOnFee=200;
        }
        double discountBase=monthlyFee*(1-discount/100.0);
        double monthlyTotal=discountBase+accessFee+addOnFee;
        double contractTotal=monthlyTotal*month;
        double savings=(monthlyFee+accessFee+accessFee)*month-contractTotal;
        if(monthlyTotal<=50){
            category="Budget";
        }
        else if(monthlyTotal<=100){
            category="Standard";
        }
        else if(monthlyTotal<=200){
            category="Premium";
        }
        else {
            category="Luxury";
        }
        System.out.println("Membership Tier: "+tier);
        System.out.println("Contract Length: "+month+"months");
        System.out.println("Access Level: "+accessLevel);
        System.out.println("Add-Ons: "+addOns);
        System.out.println("Base Monthly Fee: $"+monthlyFee);
        System.out.println("Contract Discount: "+discount+"%");
        System.out.println("Access Fee: $"+accessFee);
        System.out.println("Add-On-Fee: $"+addOnFee);
        System.out.println("Monthly Total: $"+monthlyTotal);
        System.out.println("Contract Total: $"+contractTotal);
        System.out.println("Savings vs Month-to-Month: $"+savings);
        System.out.println("Membership Category: "+category);
    }
}
