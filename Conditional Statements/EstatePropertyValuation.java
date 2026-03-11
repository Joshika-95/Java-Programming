import java.util.Scanner;
public class EstatePropertyValuation {
    public static void main(String[] args) {
        Scanner p8=new Scanner(System.in);
        String tier=p8.next();
        int squarFfootage=p8.nextInt();
        int propertyAge=p8.nextInt();
        int amenityScore=p8.nextInt();
        double basePrice=0;
        double ageAdjustment=0;
        double amenityBonus=0;
        String category="Score";
        if(tier.equals("Prime")){
            basePrice=400;
        }
        else if(tier.equals("Urban")){
            basePrice=300;
        }
        else if(tier.equals("Suburban")){
            basePrice=180;
        }
        else if(tier.equals("Rural")){
            basePrice=100;
        }
        if(propertyAge>=0 && propertyAge<=5){
            ageAdjustment=0;
        }
        else if(propertyAge>=6 && propertyAge<=15){
            ageAdjustment=-10;
        } 
        else if(propertyAge>=16 && propertyAge<=30){
            ageAdjustment=-15;
        }
        else if(propertyAge>=31){
            ageAdjustment=-35;
        }
        double baseValue=squarFfootage*basePrice;
        double adjustedValue=baseValue*(1+ageAdjustment/100.0);
        if(amenityScore>=80 && amenityScore<=100){
            amenityBonus=baseValue*0.10;
        }
        else if(amenityScore>=60 && amenityScore<=79){
            amenityBonus=baseValue*0.05;
        }
        else if(amenityScore>=40 && amenityScore<=59){
            amenityBonus=baseValue*0.02;
        }
        else if(amenityScore<40){
            amenityBonus=baseValue*0;
        }
        double finalValue=adjustedValue+amenityBonus;
        if((tier.equals("Prime"))|| (tier.equals("Urban")) ||(propertyAge<15)){
            category="Hot";
        }
        else if(tier.equals("Suburban")){
            category="Stable";
        }
        else if((tier.equals("Rural")) || (propertyAge>30)){
            category="Slow";
        }
        System.out.println("Location Tier: "+tier);
        System.out.println("Square Footage: "+squarFfootage+"sq ft");
        System.out.println("Property Age: "+propertyAge+"years");
        System.out.println("Amenity Score: "+amenityScore);
        System.out.println("Base Price Per Sq Ft: $"+basePrice);
        System.out.println("Age Adjistment: "+ageAdjustment+'%');
        System.out.println("Amenity Bonus: $"+amenityBonus);
        System.out.println("Estimated Propertity Value: $"+finalValue);
        System.out.println("Market Category: "+category);
    }
}
    
