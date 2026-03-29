import java.util.Scanner;
public class SumCalculator {
    public static void main(String[] args) {
        Scanner p2=new Scanner(System.in);
        int sum=0;
        int count=0;
        while (true) {
            System.out.println("Enter number (0 to stop) : ");
            int num=p2.nextInt();
            if(num==0){
                break;
            }
            sum+=num;
            count++;
        }
        System.out.println("Total Sum: "+sum);
        System.out.println("Count: "+count);
    }
}

    
