import java.util.*;
public class Main{
    public static int perfectnum(int n){
        int sum=0;
        for (int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int sum=perfectnum(n);
	    if(sum==n){
	        System.out.println("perfect number");
	    }
	    else {
	        System.out.println("Not a perfect number");
	    }
	}
}
