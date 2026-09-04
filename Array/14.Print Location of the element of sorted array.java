import java.util.*;
public class Main{
    static void locationSearch(int arr[], int size,int key){
        for(int i=0;i<size;i++){
            if(arr[i]==key){
                System.out.print(i);
                return;
            }
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
		    arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		locationSearch(arr,size,key);
	}
}
