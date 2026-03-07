import java.util.Scanner;
public class AgeAccessControl {
    public static void main(String[] args) {
        Scanner s8=new Scanner(System.in);
        int age=s8.nextInt();
        int idProof=s8.nextInt();
        if(age>=18 && idProof==1){
            System.out.print("Entry Allowed");
        }
        else{
            System.out.print("Entry Denied");
        }
    }
}

