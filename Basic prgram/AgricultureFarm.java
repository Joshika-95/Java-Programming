import java.util.Scanner;
public class AgricultureFarm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int yieldPerAcre=sc.nextInt();
        int acres=sc.nextInt();
        int extraYield=sc.nextInt();
        int damagedCrops=sc.nextInt();
        int finalYield=(yieldPerAcre*acres)+extraYield-damagedCrops;
        System.out.print("Final Yield: "+finalYield);
    }
}
