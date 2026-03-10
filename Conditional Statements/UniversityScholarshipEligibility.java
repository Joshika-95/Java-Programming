import java.util.Scanner;
public class UniversityScholarshipEligibility {
    public static void main(String[] args) {
        Scanner p5=new Scanner(System.in);
        double gpa=p5.nextDouble();
        double familyIncome=p5.nextDouble();
        double score=p5.nextDouble();
        String ScholarshipType=p5.next();
        String categrory="None";
        double amot=0.0;
        boolean eligible=false;
        if(gpa>=2.5){
            if(ScholarshipType.equals("Merit")){
                if(gpa>=3.8 && score>=80){
                    categrory="Full";
                    amot=25000;
                    eligible=true;
                }
                else if(gpa>=3.5 && score>=70){
                    categrory="Partial";
                    amot=15000;
                    eligible=true;
                }
                else if(gpa>3.0 && score>=60){
                    categrory="Minimal";
                    amot=8000;
                    eligible=true;
                }
            }
            else if(ScholarshipType.equals("Need-Based")){
                if(familyIncome<=30000 && gpa>=3.5){
                    categrory="Full";
                    amot=30000;
                    eligible=true;
                }
                else if(familyIncome<=50000 && gpa>=3.0){
                    categrory="Partial";
                    amot=18000;
                    eligible=true;
                }
                else if(familyIncome<70000 && gpa>=2.8){
                    categrory="Minimal";
                    amot=10000;
                    eligible=true;
                }                
            }
            else if(ScholarshipType.equals("Sports")){
                if(score>=85 && gpa>=3.0){
                    categrory="Full";
                    amot=22000;
                    eligible=true;
                }
                else if(score>=75 && gpa>=2.8){
                    categrory="Partial";
                    amot=20000;
                    eligible=true;
                }
                else if(score>=65 && gpa>=2.5){
                    categrory="Minimal";
                    amot=12000;
                }
            }
        }
        System.out.println("GPA: "+gpa);
        System.out.println("Family Income: $"+familyIncome);
        System.out.println("Extracurricular Score: "+score);
        System.out.println("Scholarship Type: "+ScholarshipType);
        if(eligible){
            System.out.println("Eligiblity: Eligible");
        }
        else {
            System.out.println("Eligibility: Not Eligible");
        }
        System.out.println("Award Amount: $"+amot);
        System.out.println("Award Category: "+categrory);
    }
}
         
