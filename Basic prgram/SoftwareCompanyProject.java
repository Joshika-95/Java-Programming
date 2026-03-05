import java.util.Scanner;
public class SoftwareCompanyProject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hours=sc.nextInt();
        int rate=sc.nextInt();
        int design=sc.nextInt();
        int testing=sc.nextInt();
        int advance=sc.nextInt();
        int finalProject=(hours*rate)+design+testing-advance;
        System.out.print("Final Project cost: "+finalProject);
    }
}
