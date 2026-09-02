import java.util.*;
public class Main{
    static boolean isprime(int n){
        for(int i=2;i<=n/2;i++){      //n/2 means the half of the number ex.12 means 12/2=6 check 2 to until 6
            if(n%i==0){
                return false;      //End of method
            }
        }
        return true;
    }
    static void primenum(int arr[],int size){
        for(int i=0;i<size;i++){
            if(isprime(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }
    }
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    for(int i=0;i<size;i++){
	        arr[i]=sc.nextInt();
	    }
	    primenum(arr,size);
	}
}
