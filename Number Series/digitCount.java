import java.util.*;
public class Main{
    public static int digitcount(int n){
        int count=0;
        while (n>0){
            count++;
            n/=10;
        }
        return count;
    }
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int ans=digitcount(n);
		System.out.println(ans);
	}
}
