import java.util.Scanner;
public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner p7=new Scanner(System.in);
        int n=p7.nextInt();
        int totalUnits=0;
        double totalRevenue=0;
        for(int i=0;i<n;i++){
            String consumerId=p7.next();
            int units=p7.nextInt();
            totalUnits+=units;
            double bill=0;
            if(units>=0 && units<=100){
                bill=units*0.10;
            } 
            else if(units>=101 && units<=200){
                bill=units*0.13;
            }
            else if(units>=201 && units<=300){
                bill=units*0.16;
            }
            else if(units>300){
                bill=units*0.20;
            }
            else{
                bill=(100*0.10)+(100*0.13)+(100*0.16)+(units-300)*0.20;
            }
            totalRevenue+=bill;
            String category="";
            if(units<=200){
                category="Low Usage";
            }
            else if(units>=201 && units<=300){
                category="Medium Usage";
            }
            else {
                category="High Usage";
            }
            System.out.println("Consumer ID: "+consumerId);
            System.out.println("Units Consumed: "+units);
            System.out.println("Bill Amount: $"+bill);
            System.out.print("Category: "+category);
            System.out.println();
        }
        double AverageBill=totalRevenue/n;
        System.out.println("Total Consumers: "+n);
        System.out.println("Total Units Consumed: "+totalUnits);
        System.out.println("Total Revenue: "+totalRevenue);
        System.out.println("Average Bill: $"+AverageBill);
    }   
}
