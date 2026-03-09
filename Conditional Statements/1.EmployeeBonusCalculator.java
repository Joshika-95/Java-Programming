import java.util.Scanner;
public class EmployeeBonusCalculator{
    public static void main(String[] args) {
        Scanner p1=new Scanner(System.in);
        int performanceRating=p1.nextInt();
        int yearOfService=p1.nextInt();
        String deptType=p1.next();
        double baseSalary=p1.nextDouble();
        double percentage=0;
        if(deptType.equals("Critical")){
            if(performanceRating==5 && performanceRating>=5){
                percentage=25;
            }
            else if(performanceRating==4 && performanceRating>=10){
                percentage=22;
            }
            else if(performanceRating==4){
                percentage=15;
            }
            else if(performanceRating==3){
                percentage=10;
            }
        }
        else if(deptType.equals("Non-Critical")){
            if(performanceRating==5){
                percentage=18;
            }
            else if(performanceRating==4){
                percentage=12;
            }
            else if(performanceRating==3){
                percentage=8;
            }
        }
        System.out.println(percentage);
        double bonus=(baseSalary*percentage)/100;
        System.out.println("Performance Rating: "+performanceRating);  
        System.out.println("Years of Service: "+yearOfService);
        System.out.println("Department: "+deptType);
        System.out.println("Bonus Percentage: "+percentage+"%");
        System.out.println("Bonus Amount: $"+bonus);
        if(performanceRating>=3){
            System.out.print("Eligible");
        }
        else {
            System.out.print("Not Eligible");
        }
    }
}



 
