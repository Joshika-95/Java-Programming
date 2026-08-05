import java.util.*;
public class Main{
    public static int factorial(int n){
        int fact=1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static int strong(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            int last=factorial(rem);
            sum+=last;
            n/=10;
        }
        return sum;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int ans = strong(n);
	    System.out.println(n==ans);
	   // if(n==ans){
	   //     System.out.print("Strong number");
	   // }
	   // else {
	   //     System.out.print("Not strong number");
	   // }
	}
}
