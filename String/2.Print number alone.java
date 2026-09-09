import java.util.*;
public class Main{
    static void numberAlone(String s){
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                System.out.print(ch);
            }
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		numberAlone(s);
	}
}
