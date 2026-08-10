import java.util.*;
public class Main{
    public static boolean automorphic(int n){
        int sq=n*n;
        while(n>0){
            if(n%10!=sq%10){
                return false;
            }
            n/=10;
            sq/=10;
        }
        return true;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    boolean ans=automorphic(n);
	    if(ans){
	        System.out.print("Automorphic");
	    }
	    else{
	        System.out.print("Not Automorphic");
	    }
	}
}
