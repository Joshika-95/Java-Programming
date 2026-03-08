import java.util.Scanner;
public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner p1=new Scanner(System.in);
        int performanceRating=p1.nextInt();
        int yearsOfService=p1.nextInt();
        String deptType=p1.next();
        double baseSalary=p1.nextDouble();
        int bonus=0;
        double amot=0;
        String status="Not Eligibile";
        if(performanceRating<=4){
            status="Eligible";
            if(performanceRating==5){
                if(deptType=="Critical"){
                    bonus=25;
                }
                else{
                    bonus=20;
                }
            }
            else if(performanceRating==4){
                if(deptType=="Critical"){
                    bonus=15;
                }
                else{
                    bonus=10;
                }
            }
            amot=(baseSalary*bonus)/100;
        }
        System.out.print("Performance Rating: "\n+performanceRating);
        System.out.print("Years of Service: "+yearsOfService);
        System.out.print("Department: "+deptType);
        System.out.print("Bonus Percentage: "+bonus+ "%");
        System.out.print("Bonus Amount: "+amot);
        System.out.print("Status: "+status);
    }
}
