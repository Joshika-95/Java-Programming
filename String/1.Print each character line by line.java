import java.util.*;
public class Main{
    static void linebyline(String s){
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            System.out.println(ch);
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		linebyline(s);
	}
}
