import java.util.*;
public class Main{
    public static int square(int n){
        return n*n;
    }
    public static int cube(int n){
        return n*n*n;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc. nextInt();
	    int ans=square(n);
	    System.out.println(ans);
	    int num=cube(n);
	   // System.out.println(ans);
	    System.out.println(num);
	}
}
