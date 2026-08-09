import java.util.*;
public class Main{
    public static int prime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
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
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int ans=prime(n);
	    int val=reverse(n);
	    int ans2=prime(val);
	    if(ans==2 && ans2==2){
	        System.out.println("Twisted prime");
	    }
	    else{
	        System.out.println("Not Twisted prime");
	    }
	}
}
