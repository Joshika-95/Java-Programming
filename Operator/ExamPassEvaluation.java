import java.util.Scanner;
public class ExamPassEvaluation{
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int theoryMarks=s1.nextInt();
        int practicalMarks=s1.nextInt();
        int average=(theoryMarks+practicalMarks)/2;
        if(theoryMarks>=50 && practicalMarks>=50 && average>=60){
            System.out.print("Result = PASS");
        }
        else{
            System.out.print("Result = FAIL");
        }

    }
}