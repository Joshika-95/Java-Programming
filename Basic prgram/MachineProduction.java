import java.util.Scanner;
public class MachineProduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double rodsPerHour=sc.nextDouble();
        double hoursWorked=sc.nextDouble();
        double overtimeRods=sc.nextDouble();
        double rejectedRods=sc.nextDouble();
        double finalProduction=(rodsPerHour*hoursWorked)+overtimeRods-rejectedRods;
        System.out.print("Usable Rods: "+finalProduction);

    }
    
}
