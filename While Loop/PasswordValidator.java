import java.util.Scanner;
public class PasswordValidator{
    public static void main(String[] args) {
        Scanner p1=new Scanner(System.in);
        String correctPassword=p1.next();
        int maxAttempts=3;
        while(maxAttempts>0){
            System.out.println("Enter password: ");
            String password=p1.next();
            if(password.equals("correct password")){
                System.out.println("Access granted!");
                break;
            }
            else{
                maxAttempts--;
            }
            if(maxAttempts>0){
                System.out.println("Incorrect! Attempts remaining: "+maxAttempts);
            }
            else{
                System.out.println("Account locked");
            }
        }
    }
}
