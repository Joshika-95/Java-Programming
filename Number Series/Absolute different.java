import java.util.*;
public class Main{
    static int absoluteDiff(int arr[], int size){
        int sumEven=0,sumOdd=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                sumEven+=arr[i];
            }
            else{
                sumOdd+=arr[i];
            }
        }
        int diff=sumEven-sumOdd;
        if(diff>=0){
            return diff;
        }
        else{
            return diff*-1;
        }
        // int diff=Math.abs(sumEven-sumOdd);
        // if(sumEven>sumOdd){
        //     diff=sumEven-sumOdd;
        // }
        // else{
        //     diff=sumOdd-sumEven;
        // }
        // System.out.println(diff);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
		    arr[i]=sc.nextInt();
		}
		int ans=absoluteDiff(arr,size);
		System.out.println(ans);
	}
}
