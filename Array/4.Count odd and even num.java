import java.util.*;
public class Main{
    static void countEvenOdd(int arr[],int size){
        int even=0;
        int odd=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    for(int i=0;i<size;i++){
	        arr[i]=sc.nextInt();
	    }
	    countEvenOdd(arr,size);
	}
}
