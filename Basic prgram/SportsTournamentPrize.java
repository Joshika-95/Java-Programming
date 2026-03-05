import java.util.Scanner;
public class SportsTournamentPrize {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int registration=sc.nextInt();
        int broadcast=sc.nextInt();
        int sponsorship=sc.nextInt();
        int prize=sc.nextInt();
        int rent=sc.nextInt();
        int advertising=sc.nextInt();
        int fund=registration+broadcast+sponsorship-prize-rent-advertising;
        System.out.print("Remaining Tournment Fund: "+fund);
    }
    
}
