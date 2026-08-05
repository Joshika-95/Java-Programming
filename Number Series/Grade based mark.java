import java.util.*;
public class Main{
    public static void marks(int n){
        if(n<=100 && n>90){
            System.out.println("Grade O");
        }
        else if(n<=90 && n>80){
            System.out.println("Grade A");
        }
        else if(n<=80 && n>70){
            System.out.println("Grade B");
        }
        else if(n<=70 && n>60){
            System.out.println("Grade C");
        }
        else if(n<=60 && n>50){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Better luck next time");
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    marks(n);
	}
}
