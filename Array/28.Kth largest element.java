import java.util.*;
public class Main{
    static int kthLargestElement(int size, int arr[], int key){
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[key-1];
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
		    arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		int ans=kthLargestElement(size,arr,key);
		System.out.print(ans);
	}
}
