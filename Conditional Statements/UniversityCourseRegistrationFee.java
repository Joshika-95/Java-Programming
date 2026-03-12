import java.util.Scanner;
public class UniversityCourseRegistrationFee{
    public static void main(String[] args) {
        Scanner p13=new Scanner(System.in);
        String status=p13.next();
        double credit=p13.nextInt();
        String programType=p13.next();
        String residency=p13.next();
        double tuition=0;
        double multiplier=0;
        double programFee=0;
        double activityFee=0;
        String category="";
        if(programType.equals("Undergraduate")){
            tuition=350;
        }
        else if(programType.equals("Graduate")){
            tuition=550;
        }
        else if(programType.equals("Professional")){
            tuition=800;
        }
        if(residency.equals("In-State")){
            multiplier=1.0;
        }
        else if(residency.equals("Out-of-State")){
            multiplier=2.5;
        }
        else if(residency.equals("International")){
            multiplier=3.0;
        }
        if(status.equals("Full-Time")){
            if(programType.endsWith("Undergraduate")){
                programFee=500;
            }
            else if(programType.equals("Graduate")){
                programFee=750;
            }
            else if(programType.equals("Professional")){
                programFee=1200;
            }
        }
        else if(status.equals("Part-Time")){
            if(programType.equals("Undergraduate")){
                programFee=300;
            }
            else if(programType.equals("Graduate")){
                programFee=750;
            }
            else if(programType.equals("Professional")){
                programFee=900;
            }
        }
        else if(status.equals("Continuing Education")){
            if((programType.equals("Undergraduate")) || (programType.equals("Graduate")) ||(programType.equals("Professional"))){
                programFee=150;
            }
        }
        if(status.equals("Full-Time")){
            activityFee=200;
        }
        else if(status.equals("Part-Time")){
            activityFee=100;
        }
        else if(status.equals("Continuing-Eduaction")){
            activityFee=50;
        }
        double tuitionCost=credit*tuition*multiplier;
        double totalFee=tuitionCost+programFee+activityFee;
        if(residency.equals("In-State")){
            if(status.equals("Full-Time")){
                category="Standard";
            }
        }
        else if(status.equals("Continuing-Education")){
            category="Reduced";
        }
        else if(residency.equals("Out-of-State") || (residency.equals("International"))){
            category="Premium";
        }
        System.out.println("Student Status: "+status);
        System.out.println("Credit Hours: "+credit);
        System.out.println("Program Type: "+programType);
        System.out.println("Residency: "+residency);
        System.out.println("Base Tution Per Credit: $"+tuition);
        System.out.println("Residency Multiplier: "+multiplier+"x");
        System.out.println("Program Fee: $"+programFee);
        System.out.println("Student Activity Fee: $"+activityFee);
        System.out.println("Total Registration Fee: $"+totalFee);
        System.out.println("Fee Category: "+category);
    }
}
    

