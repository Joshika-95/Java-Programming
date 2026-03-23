import java.util.Scanner;
public class MovieTicketBooking {
    public static void main(String[] args){
        Scanner p11=new Scanner(System.in);
        int n=p11.nextInt();
        double originalTotal=0;
        double finalTotal=0;
        for(int i=1;i<=n;i++){
            String seatType=p11.next();
            String customerType=p11.next();
            double price=0;
            double discount=0;
            if(seatType.equals("Regular")){
                price=12;
            }
            else if(seatType.equals("Premium")){
                price=18;
            }
            else if(seatType.equals("Recliner")){
                price=25;
            }
            if(customerType.equals("Adult")){
                discount=0;
            }
            else if(customerType.equals("Child")){
                discount=30;
            }
            else if(customerType.equals("Senior")){
                discount=25;
            }
            double ticketPrice=price*(1-discount/100.0);
            originalTotal+=price;
            finalTotal+=ticketPrice;
            System.out.println("Ticket "+i+": "+seatType+"- "+customerType);
            System.out.println("Base Price: $"+price);
            System.out.println("Discount: "+discount+"%");
            System.out.println("Final Price: $"+finalTotal);
            System.out.println();
        }
        boolean discountApplied=false;
        if(n>=5){
            discountApplied=true;
            finalTotal*=0.90;
        }
        double totalDiscount=originalTotal-finalTotal;
        System.out.println("Total Tickets: "+n);
        System.out.println("Orginal Total: $"+originalTotal);
        System.out.println("Total Discount: $"+totalDiscount);
        System.out.println("Final Total: $"+finalTotal);
        System.out.println("Group Discount Applied: "+(discountApplied ? "Yes": "No"));
    }
    
}
