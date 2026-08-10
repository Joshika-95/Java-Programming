import java.util.*;
public class Main{
    static int BinarytoDecimal(int n){
        int ans=0;
        int x=1;
        while(n>0){
            int rem=n%10;
            ans=ans+(rem*x);
            x=x*2;
            n/=10;
        }
        return ans;
    }
    static void decimaltoBinary(int n){
        int ans=0;
        int x=1;
        while(n>0){
            int rem=n%2;
            ans=ans+(rem*x);
            x=x*10;
            n/=2;
        }
        System.out.print(ans);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int a=sc.nextInt();
	    int ans1=BinarytoDecimal(a);
	    int b=sc.nextInt();
	    int ans2=BinarytoDecimal(b);
	    int res=ans1+ans2;
	    decimaltoBinary(res);
	}
}
