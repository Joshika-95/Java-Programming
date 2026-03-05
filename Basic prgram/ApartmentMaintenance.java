import java.util.Scanner;
public class ApartmentMaintenance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int maintenance=sc.nextInt();
        int parking=sc.nextInt();
        int hallBooking=sc.nextInt();
        int securitySalary=sc.nextInt();
        int electricity=sc.nextInt();
        int cleaning=sc.nextInt();
        int bal=maintenance+parking+hallBooking-securitySalary-electricity-cleaning;
        System.out.print("Remaining Balance: "+bal);
    }
    
}
