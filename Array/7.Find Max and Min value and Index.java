import java.util.*;
public class Main{
    static int findMaxnum(int arr[] , int size){
        int max=arr[0];
        int index=0;
        for(int i=1;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        // return max;
        return index;
    }
    static int findMinnum(int arr[], int size){
        int min=arr[0];
        int index=0;
        for(int i=1;i<size;i++){
            if(min>arr[i]){
                min=arr[i];
                index=i;
            }
        }
        // return max;
        return index;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    for(int i=0;i<size;i++){
	        arr[i]=sc.nextInt();
	    }
		System.out.println(findMaxnum(arr,size));
		System.out.println(findMinnum(arr,size));
	}
}
