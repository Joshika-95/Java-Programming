import java.util.Scanner;
public class BloodDonationCampEligiblity {
    public static void main(String[] args) {
        Scanner p13=new Scanner(System.in);
        int n=p13.nextInt();
        int eligibleCount=0;
        int rejectedCount=0;
        for(int i=0;i<n;i++){
            String donorName=p13.next();
            int age=p13.nextInt();
            double weight=p13.nextDouble();
            double hemoglobin=p13.nextDouble();
            boolean isEligible=true;
            String reason="";
            if(age<18){
                isEligible=false;
                reason="Age below 18 years";
            }
            else if(age>65){
                isEligible=false;
                reason="Age above 65 years";
            }
            else if(weight<50){
                isEligible=false;
                reason="Weight below 50 kg";
            }
            else if(hemoglobin<12.5){
                isEligible=false;
                reason="Hemoglobin below 12.5 g/dL";
            }
            System.out.println("Donor: "+donorName);
            System.out.println("Age: "+age+" years");
            System.out.println("Weight: "+weight+" kg");
            System.out.println("Hemoglobin: "+hemoglobin+" g/dL");
            if(isEligible){
                System.out.println("Status: Eligible");
                eligibleCount++;
            }
            else{
                System.out.println("Status: Not Eligible");
                System.out.println("Reason: "+reason);
                rejectedCount++;
            }
            System.out.println();
        } 
        double percentage=((double) eligibleCount/n)*100.0;
        System.out.println("Total Donor: "+n);
        System.out.println("Eligible Donor: "+eligibleCount);
        System.out.println("Rejected Donor: "+rejectedCount);
        System.out.println("Eligiblity Rate: "+percentage+" %");
    }
}
