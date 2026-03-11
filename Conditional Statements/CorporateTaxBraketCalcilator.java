import java.util.Scanner;
public class CorporateTaxBraketCalcilator {
    public static void main(String[] args) {
        Scanner p9=new Scanner(System.in);
        double annualRevenue=p9.nextDouble();
        String businessType=p9.next();
        double deductibleExpenses=p9.nextDouble();
        double taxCredits=p9.nextDouble();
        double taxRate=0;
        double grossTax=0;
        double afterCredits=0;
        double effectiveRate=0;
        double taxableIncome=annualRevenue-deductibleExpenses;
        if(businessType.equals("C-Corp")){
            if(taxableIncome<500000){
                taxRate=21;
            }
            else if(taxableIncome>=500000 && taxableIncome<=1000000){
                taxRate=24;
            }
            else if(taxableIncome>1000000 && taxableIncome<=2000000){
                taxRate=28;
            }
            else if(taxableIncome>=2000000){
                taxRate=30;
            }
        }
        else if(businessType.equals("S-Corp")){
            if(taxableIncome<=500000){
                taxRate=20;
            }
            else if(taxableIncome>=500000 && taxableIncome<=1000000){
                taxRate=25;
            }
            else if(taxableIncome>1000000){
                taxRate=28;
            }
        }
        else if(businessType.equals("LLc")){
            if(taxableIncome<200000){
                taxRate=15;
            }
            else if(taxableIncome>=200000 && taxableIncome<=500000){
                taxRate=18;
            }
            else if(taxableIncome>500000){
                taxRate=22;
            }
        }
        else if(businessType.equals("Partnership")){
            if(taxableIncome<300000){
                taxRate=18;
            }
            else if(taxableIncome>=300000 && taxableIncome<=800000){
                taxRate=22;
            }
            else if(taxableIncome>800000){
                taxRate=26;
            }
        }
        grossTax=taxableIncome*taxRate/100;
        afterCredits=grossTax-taxCredits;
        effectiveRate=(afterCredits/annualRevenue)*100;
        System.out.println("Annual Revenue: $"+annualRevenue);
        System.out.println("Businesss Type: "+businessType);
        System.out.println("Deductible Expenses: $"+deductibleExpenses);
        System.out.println("Tax Credits: $"+taxCredits);
        System.out.println("Taxable Income: $"+taxableIncome);
        System.out.println("Tax Rate: "+taxRate+"%");
        System.out.println("Gross Tax: $"+grossTax);
        System.out.println("Net After Credits: $"+afterCredits);
        System.out.println("Effective Tax Rate: "+effectiveRate+"%");
    }
}
