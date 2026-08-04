import java.util.*;
public class Main{
    public static int reverse(int n){
        int prev=0;
        while(n>0){
            int rem=n%10;
            prev=prev*10+rem;
            n/=10;
        }
        return prev;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int ans=reverse(n);
		System.out.println(ans);
	}
}
