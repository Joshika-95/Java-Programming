import java.util.*;
public class Main{
    static void reversefirstHalf(int size, int arr[]){
        int start=0,end,m=size/2;
        if(size%2==0){
            end=m-1;
        }
        else{
            end=m;
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
		reversefirstHalf(size,arr);
	}
}
