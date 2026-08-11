import java.util.*;
public class Main{
    // public static int sumofdigit(int n){
    //     int sum=0;
    //     while(n>0){                            //using function
    //         int rem=n%10;
    //         sum+=rem;
    //         n/=10;
    //     }
    //     return sum;
    // }
    public static int singledigit(int n){
        // while(n>10){
        //     int ans=sumofdigit(n);
        //     n=ans;
        // }
        // return n;
        if(n%9==0){
            return 9;
        }
        else{
            return n%9;
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int ans=singledigit(n);
		System.out.println(ans);
	}
}
// import java.util.*;
// public class Main{
// 	public static void main(String[] args) {          //not use any function
// 		System.out.println(86903%9);
// 	}
// }
