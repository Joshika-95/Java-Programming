import java.util.Scanner;
public class StudentGradeAnalysis {
    public static void main(String[] args) {
        Scanner p2=new Scanner(System.in);
        int n=p2.nextInt();
        int totalScore=0;
        int highestScore=0;
        int passCount=0;
        int failCount=0;
        for (int i=0;i<n;i++){
            String name=p2.next();
            int score=p2.nextInt();
            totalScore+=score;
            if(score>highestScore){
                highestScore=score;
            }
            char grade;
            if(score>=85 && score<=100){
                grade='A';
            }
            else if(score>=70 && score<=84){
                grade='B';
            }
            else if(score>=60 && score<=69){
                grade='C';
            }
            else if(score>=50 && score<=59){
                grade='D';
            }
            else{
                grade='F';
            }
            String status=""; 
            if(score>=60){
                status="Pass";
                passCount++;
            }
            else{
                status="Fail";
                failCount++;
            }
            System.out.println("Student: "+name);
            System.out.println("Score: "+score);
            System.out.println("Letter Grade: "+grade);
            System.out.println("Status: "+status);
            System.out.println();
        }
        double Average=(double)totalScore/n;
        System.out.println("Total Students: "+n);
        System.out.println("Class Average: "+Average);
        System.out.println("Highest Score: "+highestScore);
        System.out.println("Student Passed: "+passCount);
        System.out.println("Students Failed: "+failCount);
    }
}
