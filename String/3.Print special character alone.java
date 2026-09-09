import java.util.*;
public class Main{
    static void specialChar(String s){
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!(ch>='0' && ch<='9' || ch>='a' && ch<='z' || ch>='A' && ch<='Z')){
                System.out.print(ch);
            }
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		specialChar(s);
	}
}
