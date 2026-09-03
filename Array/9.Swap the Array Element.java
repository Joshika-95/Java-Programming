import java.util.*;
public class Main{
    static void swapArray(int arr[], int size){
        for(int i=0,j=size-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
		    arr[i]=sc.nextInt();
		}
		swapArray(arr,size);
		for(int i=0;i<size;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
