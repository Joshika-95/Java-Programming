import java.util.*;
public class Main{
    static void removeElement(int n,int target){
        int pos=1;
        int result=0;
        while(n>0){
            int rem=n%10;
            if(rem!=target){
                result=rem*pos+result;
                pos*=10;
            }
            n/=10;
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        removeElement(n,target);
    }
}
