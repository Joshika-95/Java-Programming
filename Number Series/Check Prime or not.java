import java.util.*;
public class Main{
    public static boolean factors(int n){
        for (int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    boolean count=factors(n);
	    if(count){
	        System.out.print("prime number");
	    }
	    else{
	        System.out.println("Not a prime number");
	    }
		
	}
}
