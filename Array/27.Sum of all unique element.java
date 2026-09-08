import java.util.*;
public class Main{
    static int sumofAllUniqueElement(int size, int arr[]){
        int sum=0;
        for(int i=0;i<size;i++){
            int count=0;
            for(int j=0;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                sum+=arr[i];
            }
        }
        return sum;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
		    arr[i]=sc.nextInt();
		}
		int ans=sumofAllUniqueElement(size,arr);
		System.out.println(ans);
	}
}
