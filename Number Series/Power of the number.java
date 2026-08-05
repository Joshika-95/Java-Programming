import java.util.*;
public class Main{
    public static int power(int b,int e){
        int a=1;
        for (int i=1;i<=e;i++){
            a*=b;
        }
        return a;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int base = sc.nextInt();
	    int expo = sc.nextInt();
	    int ans = power(base,expo);
		System.out.println(ans);
	}
}
