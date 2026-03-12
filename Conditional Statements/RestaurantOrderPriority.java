import java.util.Scanner;
public class RestaurantOrderPriority {
    public static void main(String[] args) {
        Scanner p11=new Scanner(System.in);
        String orderType=p11.next();
        String status=p11.next();
        double orderValue=p11.nextDouble();
        String timeSlot=p11.next();
        int baseDiscount=0;
        int adjustment=0;
        double serviceFee=0;
        int time=0;
        String priority="Hours";
        if(status.equals("Gold")){
            baseDiscount=15;
        }
        else if(status.equals("Silver")){
            baseDiscount=10;
        }
        else if(status.equals("Bronze")){
            baseDiscount=5;
        }
        else if(status.equals("None")){
            baseDiscount=0;
        }
        if(timeSlot.equals("Peak")){
            adjustment=+0;
        }
        else if(timeSlot.equals("Regular")){
            adjustment=0;
        }
        else if(timeSlot.equals("Late-Night")){
            adjustment=-5;
        }
        int totalDiscount=baseDiscount-adjustment;
        if(orderType.equals("Delivery")){
            serviceFee=orderValue*0.10;
        }
        else if(orderType.equals("Takeout")){
            serviceFee=orderValue*0.03;
        }
        else if(orderType.equals("Dine-In")){
            serviceFee=orderValue=0;
        }
        double discountValue=orderValue*(1-totalDiscount/100.0);
        double finalAmount=discountValue+serviceFee;
        if(timeSlot.equals("Peak")){
            if(orderType.equals("Delivery")){
                priority="High";
            }
        }
        else if(timeSlot.equals("Regular")){
            priority="Medium";
        }
        else if(timeSlot.equals("Late-Night")){
            priority="Low";
        }
        if(priority.equals("High")){
            time=30;
        }
        else if(priority.equals("Medium")){
            time=25;
        }
        else if(priority.equals("Low")){
            time=15;
        }
        System.out.println("Order Type: "+orderType);
        System.out.println("Loyalty Status: "+status);
        System.out.println("Order Value: $"+orderValue);
        System.out.println("Time Slot: "+timeSlot);
        System.out.println("Base Discount: "+baseDiscount+"%");
        System.out.println("Time-Based Adjustment: "+adjustment+"%");
        System.out.println("Service Fee: $"+serviceFee);
        System.out.println("Final Amount: $"+finalAmount);
        System.out.println("Kitchen Priority: "+priority);
        System.out.println("Estimated Prep Time: "+time+"minutes");
    }
    
}
