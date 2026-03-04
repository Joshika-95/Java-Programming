import java.util.Scanner;
public class ServiceEarings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double deliveries=sc.nextDouble();
        double payout=sc.nextDouble();
        double incentive=sc.nextDouble();
        double fuelCost=sc.nextDouble();
        double netEarnings=(deliveries*payout)+incentive-fuelCost;
        System.out.print("Driver Earings: "+netEarnings);
    }
    
}
