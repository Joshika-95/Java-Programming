import java.util.*;
public class Main{
    static boolean searchElement(int arr[], int size, int target){
        for(int i=0;i<size;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    for(int i=0;i<size;i++){
	        arr[i]=sc.nextInt();
	    }
	    int target=sc.nextInt();
	    if(searchElement(arr,size,target)){
	        System.out.println("Found");
	    }
	    else {
	        System.out.println("Not Found");
	    }
	}
}
