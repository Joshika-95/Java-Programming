import java.util.*;
public class Main{
    static int secondMin(int size, int arr[]){
        int min,smin;
        if(arr[0]<arr[1]){      // if u put > means find secondMaximum 
            min=arr[0];
            smin=arr[1];
        }
        else{
            min=arr[1];
            smin=arr[0];
        }
        for(int i=2;i<size;i++){
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }
            else if(arr[i]< smin && arr[i]!=min){
                smin=arr[i];
            }
        }
        return smin;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println(secondMin(size,arr));
	}
}
