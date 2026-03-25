import java.util.Scanner;
public class OnlineQuizScoreCalculator {
    public static void main(String[] args) {
        Scanner p16=new Scanner(System.in);
        int n=p16.nextInt();
        int pass=0;
        int fail=0;
        int totalScore=0;
        int highestScore=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            String studentName=p16.next();
            int correctans=p16.nextInt();
            int wrongans=p16.nextInt();
            int unattampted=p16.nextInt();
            int score=(correctans*4)-(wrongans*3)+(unattampted*0);
            String res="";
            if(score>=32){
                res="Pass";
                pass++;
            }
            else{
                res="Fail";
                fail++;
            }
            totalScore+=score;
            if(score>highestScore){
                highestScore=score;
            }
            System.out.println("Student: "+studentName);
            System.out.println("Correct: "+correctans);
            System.out.println("Wrong: "+wrongans);
            System.out.println("Unattempted: "+unattampted);
            System.out.println("Score: "+score);
            System.out.println("Result: "+res);
        }
        double avg=totalScore/n;
        System.out.println("Total Students: "+n);
        System.out.println("Pass Count: "+pass);
        System.out.println("Fail Count: "+fail);
        System.out.println("Class Average: "+avg);
        System.out.println("Highest Score: "+highestScore);
    }
}
    
