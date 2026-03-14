import java.util.Scanner;
public class InvestmentPortfolioRiskAssessment {
    public static void main(String[] args) {
        Scanner p23=new Scanner(System.in);
        int percentage=p23.nextInt();
        int years=p23.nextInt();
        String risk=p23.next();
        String volatility=p23.next();
        
        int baseRisk=percentage;  
        String category="";  
        String alligned="";
        String plan="";
        String rebal="";
        if(years>=1 && years<=5){
            if(percentage>50){
                baseRisk+=20;
            }
        }
        else if(years>=6 && years<=10){
            if(percentage>60){
                baseRisk+=10;
            }
        }
        else if(years>=11 && years<=20){
            if(percentage>80){
                baseRisk+=5;
            }
        }
        if(volatility.equals("Low")){
            baseRisk+=0;
        }
        else if(volatility.equals("Medium")){
            baseRisk+=10;
        }
        else if(volatility.equals("High")){
            baseRisk+=20;
        }
        if(baseRisk>=1 && baseRisk<=30){
            category="Low";
        }
        else if(baseRisk>=31 && baseRisk<=60){
            category="Moderate";
        }
        else if(baseRisk>=61 && baseRisk<=80){
            category="High";
        }
        else if(baseRisk>=81 && baseRisk<=100){
            category="Very High";
        }
        if(risk.equals("Conservative")){
            if (category.equals("Low")) {
                alligned="Well Aligned";  
            }
            else if(category.equals("Moderate")){
                alligned="Acceptable";
            }
            else if(category.equals("High") || (category.equals("Very High"))){
                alligned="Misaligned";
            }
        }
        else if(risk.equals("Moderate")){
            if(category.equals("Moderate")){
                alligned="Well Aligned";
            }
            else if(category.equals("Low") || (category.endsWith("High"))){
                alligned="Acceptable";
            }
            else if(category.equals("Very High")){
                alligned="Misaligned";
            }
        }
        else if(risk.equals("Aggressive")){
            if(category.equals("High") || (category.equals("Very High"))){
                alligned="Well Aligned";
            }
            else if(category.equals("Moderate")){
                alligned="Acceptable";
            }
            else if(category.equals("Low")){
                alligned="Misaligned";
            }
        }
        if(alligned.equals("Well Aligned")){
            plan="Portfolio is appropriately balanced for your profile";
            rebal="No action needed";
        }
        else if(alligned.equals("Acceptable")){
            plan="High risk level acceptable given long horizon and tolerance";
            rebal="Mointor closely,consider slight reduction if volatility persists";
        }
        else if(alligned.equals("Misaligned")){
            plan="Portfolio is too conservation for your risk tolerance";
            rebal="Increase stocks to 80-90% for better growth potential";
        }
        else {
            plan="Portfolio risk significantly exceeds tolerance level";
            rebal="Reduce stocks to 30-40%, increase bonds and cash";
        }
        System.out.println("Stock Allocation: "+percentage+"%");
        System.out.println("Bond Allocation: "+(100-percentage)+"%");
        System.out.println("Investment Horizon: "+years+"years");
        System.out.println("Risk Tolerance: "+risk);
        System.out.println("Market Volatility: "+volatility);
        System.out.println("Portfolio Risk Score: "+baseRisk+"/100");
        System.out.println("Risk Category: "+category);
        System.out.println("Allignment Status: "+alligned);
        System.out.println("Recommendation: "+plan);
        System.out.println("Suggested Rebalancing: "+rebal);
    }
}
    

