import java.util.*;
public class Main{
    static void reverseSecondHalf(int size, int arr[]){
        int start,end=size-1,m=size/2;
        if(size%2==0){
            start=m;
        }
        else{
            start=m+1;
        }
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        } 
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
		    arr[i]=sc.nextInt();
		}
		reverseSecondHalf(size,arr);
	}
}
