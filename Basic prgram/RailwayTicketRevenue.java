import java.util.Scanner;
public class RailwayTicketRevenue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int gensPass=sc.nextInt();
        int genFare=sc.nextInt();
        int acPass=sc.nextInt();
        int acFare=sc.nextInt();
        int platform=sc.nextInt();
        int maintenance=sc.nextInt();
        int fuelCost=sc.nextInt();
        int railwayRevenue=(gensPass*genFare)+(acPass*acFare)+platform-maintenance-fuelCost;
        System.out.print("Net Railway Revenue: "+railwayRevenue);
    }

    
}
