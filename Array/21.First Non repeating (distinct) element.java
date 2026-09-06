import java.util.*;
public class Main{
    static int firstDistinct(int arr[], int size){
        for(int i=0;i<size;i++){
            boolean repeat=false;
            for(int j=0;j<size;j++){
                if(i!=j && arr[i]==arr[j]){
                    repeat=true;
                    break;      // End of the particular block
                }
            }
            if(!repeat){
                return arr[i];
                // return;         //End of the  all block using keyword
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.print(firstDistinct(arr,size));
	}
}
