import java.util.*;
public class Main{
    public static int binaryTodecimal(int n){
        int ans=0;
        int x=1;
        while(n>0){
            int rem=n%10;
            ans=ans+(rem*x);
            x*=2;
            n/=10;
        }
        return ans;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int ans=binaryTodecimal(n);
	    System.out.println(ans);
	}
}
