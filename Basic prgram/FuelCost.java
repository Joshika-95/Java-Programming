import java.util.Scanner;

public class FuelCost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double distance=sc.nextDouble();
        double mileage =sc.nextDouble();
        double fuelPrice=sc.nextDouble();
        double tollCharge=sc.nextDouble();
        double fuelExpenses=distance/mileage;
        double fuelCost=fuelExpenses*fuelPrice;
        double totalTravelExpense=tollCharge+fuelCost;
        System.out.print("Total Trip Cost: "+totalTravelExpense);
    }
    
}
