import java.util.*;
public class Main{
    public static int decimalTooctal(int n){
        int ans=0;
        int x=1;
        while(n>0){
            int rem=n%8;
            ans=ans+(rem*x);
            x*=10;
            n/=8;
        }
        return ans;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int ans=decimalTooctal(n);
		System.out.println(ans);
	}
}
