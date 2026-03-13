import java.util.Scanner;
public class FoodDeliveryFee {
    public static void main(String[] args) {
        Scanner p24=new Scanner(System.in);
        double miles=p24.nextDouble();
        double value=p24.nextDouble();
        String timeSlot=p24.next();
        String condition=p24.next();
        double baseFee=3.0;
        double surchange=miles*1.0;
        double time=0;
        double weather=0;
        double discount=0;
        String priority="";
        if(timeSlot.equals("Breakfast")){
            surchange=0;
        }
        else if(timeSlot.equals("Lunch")){
            surchange=2.5;      
        }
        else if(timeSlot.equals("Dinner")){
            surchange=2.0;
        }
        else if(timeSlot.equals("Late-Night")){
            surchange=1.5;
        }
        if(condition.equals("Clear")){
            weather=0;
        }
        else if(condition.equals("Rain")){
            weather=2;
        }
        else if(condition.equals("Snow")){
            weather=3;
        }
        else if(condition.equals("Storm")){
            weather=5;
        }
        if(value>=30 && value<=49.99){
            discount=1;
        }
        else if(value>=50 && value<=74.99){
            discount=3;
        }
        else if(value>=75){
            discount=5;
        }
        double finalFee=baseFee+surchange+time+weather-discount;
        if(finalFee<2.99){
            finalFee=2.99;
        }
        double deliveryTime=miles*8;
        if((timeSlot.equals("Lunch")) || (timeSlot.equals("Dinner"))){
            deliveryTime+=10;   
        }
        if(condition.equals("Rain")){
            deliveryTime+=5;
        }
        else if(condition.equals("Snow")){
            deliveryTime+=10;
        }
        else if(condition.equals("Storm")){
            deliveryTime+=15;
        }
        if(value>60){
            priority="Express";
        }
        else if((timeSlot.equals("Dinner")) || (timeSlot.equals("Lunch"))){
            priority="High";
        }
        else {
            priority="Standard";
        }
        System.out.println("Delivery Distance: "+miles+"miles");
        System.out.println("Order Value: $"+value);
        System.out.println("Time Slot: "+timeSlot);
        System.out.println("Weather Condition: "+condition);
        System.out.println("Base Delivery Fee: $"+baseFee);
        System.out.println("Distance Surcharge: $"+surchange);
        System.out.println("Peak Time Surcharge: $"+time);
        System.out.println("Weather Suracharge: $"+weather);
        System.out.println("Order Value Discount: $"+discount);
        System.out.println("Final Delivery Fee: $"+finalFee);
        System.out.println("Estimated Delivery Time: "+(int)deliveryTime+"minutes");
        System.out.println("Service Priority: "+priority);
    }
}

    
    
