import java.util.Scanner;
public class MonthlySalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner p4=new Scanner(System.in);
        int n=p4.nextInt();
        double commissionRate=0;
        double totalSales=0;
        double totalCommission=0;
        String performer="";
        double highestSales=0;
        for (int i=0;i<n;i++){
            String repName=p4.next();
            double salesAmot=p4.nextDouble();
            totalSales+=salesAmot;
            if(n>=0 && n<=40000){
                commissionRate=5;
            }
            else if(n>=40001 && n<=80000){
                commissionRate=8;
            }
            else if(n>=80001 && n<=100000){
                commissionRate=10;
            }
            else if(n>=100001 && n<=150000){
                commissionRate=12;
            }
            else if(n>150000){
                commissionRate=15;
            }
            double commission=salesAmot*(commissionRate/100.0);
            double bonus=0;
            if(salesAmot>=100000){
                bonus=2000;
            }
            else if(salesAmot>=150000){
                bonus=3000;
            }
            double totalPayout=commission+bonus;
            totalCommission+=totalPayout;
            if(salesAmot>highestSales){
                highestSales=salesAmot;
                performer=repName;
            }
            System.out.println("Sales Rep: "+repName);
            System.out.println("Sales Amount: $"+salesAmot);
            System.out.println("Commission Rate: "+commissionRate+"%");
            System.out.println("Commission Earned: $"+commission);
            System.out.println("Bonus: $"+bonus);
            System.out.println("Total Payout: $"+totalPayout);
            System.out.println();
        }
        System.out.println("Total Sales Reps: "+n);
        System.out.println("Total Sales: $"+totalSales);
        System.out.println("Total Commission: $"+totalCommission);
        System.out.println("Total Performer: "+performer);
    }
    
}
