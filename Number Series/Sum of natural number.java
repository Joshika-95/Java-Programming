import java.util.*;
public class Main{
    public static int sumofnum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ans = sumofnum(n);
        System.out.println(ans);
    }
}
