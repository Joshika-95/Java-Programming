import java.util.*;
public class Main{
    public static int sumoffactor(int n){
        int sum=0;
        for (int i=1; i<=n; i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int ans=sumoffactor(n);
		System.out.println(ans);
	}
}
