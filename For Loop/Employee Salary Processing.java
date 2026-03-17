import java.util.*;
public class EmployeeSalaryProcessing {
    public static void main(String[] args) {
        Scanner p1=new Scanner(System.in);
        int n=p1.nextInt();
        int totalPayroll=0;
        for(int i=1; i<=n; i++){
            String name=p1.next();
            double salary=p1.nextDouble();
            int rating=p1.nextInt();
            int percentage=0;
            if(rating==5){
                percentage=15;
            }
            else if(rating==4){
                percentage=10;
            }
            else if(rating==3){
                percentage=5;
            }
            else if(rating==2){
                percentage=2;
            }
            else if(rating==1){
                percentage=0;
            }
            double finalSalary=salary*(1+percentage/100.0);
            totalPayroll+=finalSalary;
            System.out.println("Employee: "+name);
            System.out.println("Base Salary: $"+salary);
            System.out.println("Perfomance Rating: "+rating);
            System.out.println("Increment: "+percentage+"%");
            System.out.println("Final Salary: $"+finalSalary);
            if(i!=n){
                System.out.println();
            }
        }
        double avg=totalPayroll/n;
        System.out.println("Total Employee Processed: "+n);
        System.out.println("Total Payroll: $"+totalPayroll);
        System.out.println("Average Salary: $"+avg);
    }
}


