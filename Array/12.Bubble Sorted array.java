import java.util.*;
public class Main{
    static void sorting(int arr[], int size){
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){       //if put < means  desecending order &  > means ascending order
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    for(int i=0;i<size;i++){
	        arr[i]=sc.nextInt();
	    }
	    sorting(arr,size);
	    for(int i=0;i<size;i++){
	        System.out.print(arr[i]+" ");
	    }
	}
}
