import java.util.Scanner;
public class GymTrainerMonthlySalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int baseSalary =sc.nextInt();
        int sessions=sc.nextInt();
        int payPerSession=sc.nextInt();
        int bonus=sc.nextInt();
        int maintenance=sc.nextInt();
        int salary=baseSalary+(sessions*payPerSession)+bonus-maintenance;
        System.out.print("Final Salary: "+salary);
    }
}
