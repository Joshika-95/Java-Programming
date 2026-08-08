// import java.util.*;
// public class Main{
//     public static void fibo(int n){
//         int first=0;
//         int second=1;
//         for(int i=0;i<=n;i++){
//             System.out.print(first+" ");
//             int x=first+second;
//             first=second;
//             second=x;
//         }
//     }
// 	public static void main(String[] args) {
// 	    Scanner sc = new Scanner(System.in);
// 	    int n=sc.nextInt();
// 	    fibo(n);
// 	}
// }


import java.util.*;
public class Main{
    public static int fibo(int n){
        int f=0;
        int s=1;
        for (int i=0;i<n;i++){
            int x=f+s;
            f=s;
            s=x;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ans=fibo(n);
        System.out.print(ans);
    }
}
