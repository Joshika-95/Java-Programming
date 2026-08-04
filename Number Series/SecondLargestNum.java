import java.util.*;
public class SecondLargestNum {
    public static void main(String[] args) {
        int a=45;
        int b=35;
        int c=25;
        if (a>b && a>c) || (a<b && a>c){
            System.out.print("2Max= "+a);
        }
        else if (b>a && b<c) ||(b>c && b<a){
            System.out.print("2Max= "+b);
        }
        else {
            System.out.print("2Max= "+c);
        }
    }
    
}
