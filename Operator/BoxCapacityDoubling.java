import java.util.Scanner;
public class BoxCapacityDoubling {
    public static void main(String[] args) {
        Scanner s11=new Scanner(System.in);
        int baseBox=s11.nextInt();
        int levels=s11.nextInt();
        int capacity=baseBox << levels;
        System.out.print("Total Capacity: "+capacity);
    }
    
}
