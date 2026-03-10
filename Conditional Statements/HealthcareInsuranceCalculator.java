import java.util.Scanner;
public class HealthcareInsuranceCalculator {
    public static void main(String[] args) {
        Scanner p3=new Scanner(System.in);
        int age=p3.nextInt();
        String smokingStatus=p3.next();
        String preExistingConditions=p3.next();
        String coverageTier=p3.next();
        double base=0;
        double risk=0;
        if(age>=18 && age<=30){
            if(coverageTier.equals("Basic")){
                base=200;
            }
            else if(coverageTier.equals("Standard")){
                base=300;
            }
            else if(coverageTier.equals("Premium")){
                base=500;
            }
        }
        else if(age>=31 && age<=50){
            if(coverageTier.equals("Basic")){
                base=250;
            }
            else if(coverageTier.equals("Standard")){
                base=350;
            }
            else if(coverageTier.equals("Premium")){
                base=600;
            }
        }
        else if(age>=51 && age<=65){
            if(coverageTier.equals("Basic")){
                base=350;
            }
            else if(coverageTier.equals("Standard")){
                base=450;
            }
            else if(coverageTier.equals("Premium")){
                base=700;
            }
        }
        else if(age>=66){
            if(coverageTier.equals("Basic")){
                base=400;
            }
            else if(coverageTier.equals("Standard")){
                base=550;
            }
            else if(coverageTier.equals("Premium")){
                base=800;
            }
        }
        if(smokingStatus.equals("Smoker") && preExistingConditions.equals("Yes")){
            risk=base*0.70;
        }
        else if(smokingStatus.equals("Smoker")){
            risk=base*0.40;
        }
        else if(preExistingConditions.equals("Yes")){
            risk=base*0.30;
        }
        else{
            risk=0;
        }
        double monthly=base+risk;
        System.out.println("Age: "+age);
        System.out.println("Smoking Status: "+smokingStatus);
        System.out.println("Pre-existing Conditions: "+preExistingConditions);
        System.out.println("Coverage Tier: "+coverageTier);
        System.out.println("Base Premium: $"+base);
        System.out.println("Risk Surcharge: $"+risk);
        System.out.println("Total Monthly Premium: $"+monthly);
    }
}
    
        