import java.util.Scanner;
public class SystemLoginAuthentication {
    public static void main(String[] args) {
        java.util.Scanner s9=new Scanner(System.in);
        int usernameMatch=s9.nextInt();
        int passwordMatch=s9.nextInt();
        int accLocked=s9.nextInt();
        if(usernameMatch==1 && passwordMatch==1 && accLocked!=1){
            System.out.print("Login Success");
        }
        else{
            System.out.print("Login Failed");
        }
    }
}
