//print element greater than the previous element
import java.util.*;
public class Main{
    static void printingMaxValue(int arr[], int size){
        int max=arr[0];
        System.out.print(max+" ");
        for(int i=1;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
                System.out.print(max+" ");
            }
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int [size];
		for(int i=0;i<size;i++){
		    arr[i]=sc.nextInt();
		}
		printingMaxValue(arr,size);
	}
}
