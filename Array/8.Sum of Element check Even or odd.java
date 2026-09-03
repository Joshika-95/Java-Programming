import java.util.*;
public class Main{
    static int evenorOdd(int arr[], int size){
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        return sum;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int size=sc.nextInt();
	    int arr[]=new int [size];
	    for(int i=0;i<size;i++){
	        arr[i]=sc.nextInt();
	    }
	    int ans=evenorOdd(arr,size);
		System.out.println("Sum : "+ans);
		if(ans%2==0){
		    System.out.println("Category : Even");
		}
		else{
		    System.out.println("Category : Odd");
		}
	}
}
