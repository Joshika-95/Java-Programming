import java.util.Scanner;
public class YouTubeMonthlyIncome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ads=sc.nextInt();
        int sponserIncome=sc.nextInt();
        int affiliateIncome=sc.nextInt();
        int tax=sc.nextInt();
        int productionCost=sc.nextInt();
        int Income=ads+sponserIncome+affiliateIncome-tax-productionCost;
        System.out.print("Final YouTube Income: "+Income);
    }
    
}
