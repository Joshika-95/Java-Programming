import java.util.*;
public class Main{
    static void removeDuplicate(int arr[], int size){
        boolean visited[]=new boolean [size];
        boolean printed=false;
        for(int i=0;i<size;i++){
            if(visited[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            if(count==1){
                System.out.print(arr[i]+" ");
                printed=true;
            }
        }
        if(!printed){
            System.out.print(0);
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
		    arr[i]=sc.nextInt();
		}
		removeDuplicate(arr,size);
	}
}
