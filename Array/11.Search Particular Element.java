import java.util.*;
public class Main{
    static void searchElement(int arr[], int size, int target){
        int index=0;
        for(int i=0;i<size;i++){
            if(arr[i]==target){
                index=i;
            }
        }
        System.out.println(index);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    for(int i=0;i<size;i++){
	        arr[i]=sc.nextInt();
	    }
	    int target=sc.nextInt();
	    searchElement(arr,size,target);
	}
}
