import java.util.Scanner;

public class Wage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double daysWorked=sc.nextDouble();
        double wagePerDay=sc.nextDouble();
        double overtimeBonus=sc.nextDouble();
        double maintainCharge=sc.nextDouble();
        double base=daysWorked*wagePerDay;
        double addBonus=base+overtimeBonus;
        double deductCharge=addBonus-maintainCharge;
        System.out.print("Final Weekly Wage: "+deductCharge);
    }
    
}
