import java.util.*;
public class Main{
    static int ans=0;          //Global variable
    static int x=1;
    static int rem=0;
    public static int decimalTobinary(int n){
        // int ans=0;
        // int x=1;          //Local variable
        while(n>0){
            rem=n%2;
            ans=ans+(rem*x);
            x*=10;
            n/=2;
        }
        return ans;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int ans=decimalTobinary(n);
		System.out.println(ans);
	}
}
