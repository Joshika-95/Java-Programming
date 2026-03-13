import java.util.Scanner;
public class CreditCardRewardPointsCalculator {
    public static void main(String[] args) {
        Scanner p17=new Scanner(System.in);
        String cardtier=p17.next();
        String category=p17.next();
        double amount=p17.nextDouble();
        String status=p17.next();
        String rewards="";
        double bonus=1.0;
        double multiplier=0;
        double mul=1.0;
        double baseRate=1.0;
        if(category.equals("Groceries")){
            bonus=2.0;
        }
        else if(category.equals("Dining")){
            bonus=2.5;
        }
        else if(category.equals("Travel")){
            bonus=3.0;
        }
        else if(category.equals("Gas")){
            bonus=2.0;
        }
        else if(category.equals("Other")){
            bonus=1.0;
        }
        if(cardtier.equals("Basic")){
            multiplier=1.0;
            rewards="Standard";
        }
        else if(cardtier.equals("Gold")){
            multiplier=1.25;
            rewards="Enhanced";
        }
        else if(cardtier.equals("Platinum")){
            multiplier=1.5;
            rewards="Premium";
        }
        else if(cardtier.equals("Black")){
            multiplier=2.0;
            rewards="Elite";
        }
        if(status.equals("None")){
            mul=1.0;
        }
        else if(status.equals("Double-Points")){
            mul=2.0;
        }
        else if(status.equals("Triple-Points")){
            mul=3.0;
        }
        double pointsEarned=amount*baseRate*bonus*multiplier*mul;
        double cashValue=pointsEarned*0.01;
        System.out.println("Card Tier: "+cardtier);
        System.out.println("Purchase Category: "+category);
        System.out.println("Transaction Amount: $"+amount);
        System.out.println("Promotional Status: "+status);
        System.out.println("Base Points Rate: 1.0 points per doller");
        System.out.println("Category Bonus: "+bonus+"x");
        System.out.println("Tier Multiplier: "+multiplier+"x");
        System.out.println("Promotional Multiplier: "+mul+"x");
        System.out.println("Points Earned: "+pointsEarned);
        System.out.println("Equivalent Cash Value: $"+cashValue);
        System.out.println("Rewards Tier: "+rewards);
    }
}
        


    
    
    

