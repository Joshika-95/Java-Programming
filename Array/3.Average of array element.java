import java.util.*;
public class Main{
    public static void avergeofarray(int arr[],int size){
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.print(sum/size);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    for(int i=0;i<size;i++){
	        arr[i]=sc.nextInt();
	    }
	    avergeofarray(arr,size);
	}
}
