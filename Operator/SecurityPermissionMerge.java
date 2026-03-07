import java.util.Scanner;
public class SecurityPermissionMerge {
    public static void main(String[] args) {
        Scanner s14=new Scanner(System.in);
        int permissionA=s14.nextInt();
        int permissionB=s14.nextInt();
        int permissionCode=permissionA | permissionB;
        System.out.print("Merged Permission Code: "+permissionCode);
        }
}
