import java.util.Scanner;
public class GymMembershipRenewalTracker {
    public static void main(String[] args) {
        Scanner p17=new Scanner(System.in);
        int n=p17.nextInt();
        int count=0;
        double totalRevenue=0;
        for(int i=0; i<n; i++){
            String memberName=p17.next();
            String memberType=p17.next();
            int expiry=p17.nextInt();
            double fee=0;
            if(memberType.equals("Basic")){
                fee=50;
            }
            else if(memberType.equals("Premium")){
                fee=100;
            }
            else if(memberType.equals("VIP")){
                fee=200;
            }
            double discount=0;
            if(expiry>=45){
                discount=20;
            }
            else if(expiry>=30 && expiry<=44){
                discount=15;
            }
            else if(expiry>=15 && expiry<=29){
                discount=10;
            }
            else if(expiry<15){
                discount=0;
            }
            String priority="";
            if(expiry<10){
                priority="Urgent";
                count++;
            }
            else if(expiry>=10 && expiry<=30){
                priority="High";
            }
            else if(expiry>30){
                priority="Normal";
            }
            double finalFee=fee*(1-discount/100.0);
            totalRevenue+=finalFee;
            System.out.println("Member: "+memberName);
            System.out.println("Membership: "+memberType);
            System.out.println("Days Until Expiry: "+expiry);
            System.out.println("Reneweal Fee: $"+fee);
            System.out.println("Discount: "+discount+"%");
            System.out.println("Final Fee: $"+finalFee);
            System.out.println("Priority: "+priority);
            System.out.println();
        }
        double avg=totalRevenue/n;
        System.out.println("Total Members: "+n);
        System.out.println("Urgent Renewals: "+count);
        System.out.println("Total Renewal Revenue: $"+totalRevenue);
        System.out.println("Average Renewal Fee: $"+avg);
    }
}
