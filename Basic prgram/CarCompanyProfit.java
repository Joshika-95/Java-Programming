import java.util.Scanner;
public class CarCompanyProfit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int rent=sc.nextInt();
        int lateCharges=sc.nextInt();
        int fuelCost=sc.nextInt();
        int maintenance=sc.nextInt();
        int netProfit=(days*rent)+lateCharges-fuelCost-maintenance;
        System.out.print("Net Profit: "+netProfit);
    }

    
}
