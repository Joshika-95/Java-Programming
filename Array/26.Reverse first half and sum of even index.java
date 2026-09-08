import java.util.*;
public class Main{
    static void reverseFirstHalf(int size, int arr[]){
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
    static void sumofEvenIndex(int size, int arr[]){
        int sum=0;
        for(int i=0;i<size;i++){
            if(i%2==0){
                sum+=arr[i];
            }
        }
        System.out.print(sum);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int [size];
		for(int i=0;i<size;i++){
		    arr[i]=sc.nextInt();
		}
		reverseFirstHalf(size,arr);
		System.out.println();
		sumofEvenIndex(size,arr);
	}
}
