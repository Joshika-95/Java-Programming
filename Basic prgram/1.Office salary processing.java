import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the basic pay: ");
        int basic_pay=scan.nextInt();
        System.out.print("Enter the hra: ");
        int hra=scan.nextInt();
        System.out.print("Enter the bonus: ");
        int bonus=scan.nextInt();
        System.out.print("Enter the tax: ");
        int tax=scan.nextInt() ;
        System.out.print("Enter the pf: ");
        int pf=scan.nextInt();
        System.out.print("Home Salary: "+(basic_pay+hra+bonus-tax-pf));
    }
}
