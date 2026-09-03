import java.util.*;
public class Main{
    static boolean palindromeArray(int arr[], int size){
        for(int i=0,j=size-1;i<j;i++,j--){
            if(arr[i]!=arr[j]){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
		    arr[i]=sc.nextInt();
		}
		if(palindromeArray(arr,size)){
		    System.out.println("Palindrome Array");
		}
		else {
		    System.out.println("Not Palindrome Array");
		}
	}
}
