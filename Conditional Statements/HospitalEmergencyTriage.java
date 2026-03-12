import java.util.Scanner;
public class HospitalEmergencyTriage {
    public static void main(String[] args) {
        Scanner p7=new Scanner(System.in);
        int heartRate=p7.nextInt();
        int bloodPressure=p7.nextInt();
        int diastolic=p7.nextInt();
        double temperature=p7.nextDouble();
        String servrity=p7.next(); 
        String priority="Life";
        int time=0;
        String action="Emergency";
        if(servrity.equals("Life-Threatening")){
            if(heartRate<50 || heartRate>130 || bloodPressure>180 || bloodPressure<90 || temperature>103 || temperature<96){
                priority="Critical";
                time=0;
                action="Immediate Emergency Care";
            }
        }
        else if(servrity.equals("Severe")){
            if((heartRate>=50 || heartRate<=60 || heartRate>=110 || heartRate<=130)|| (bloodPressure>=160 || bloodPressure<=180 || bloodPressure>=90 || bloodPressure<=100) || (temperature>=101 || temperature<=103 || temperature>=96 || temperature<=97)){
                priority="Urgent";
                time=15;
                action="Priority Medical Attention";
            }
        }
        else if(servrity.equals("Moderate")){
            priority="Standard";
            time=45;
            action="Standard Examination";            
        }
        else{
            priority="Non-Urgent";
            time=90;
            action="Routine Check-up";
        }
        System.out.println("Heart Rate: "+heartRate+"bpm");
        System.out.println("Blood Pressure: "+bloodPressure+"/"+diastolic);
        System.out.println("Temperature: "+temperature+"F");
        System.out.println("Symptom Severity: "+servrity);
        System.out.println("Triage Priority: "+priority);
        System.out.println("Estimated Wait Time: "+time+"minutes");
        System.out.println("Recommended Action: "+action);
    }
}
        