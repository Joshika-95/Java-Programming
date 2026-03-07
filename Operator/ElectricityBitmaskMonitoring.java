import java.util.Scanner;
public class ElectricityBitmaskMonitoring {
    public static void main(String[] args) {
        Scanner s13=new Scanner(System.in);
        int connectionValue=s13.nextInt();
        int applianceMask=s13.nextInt();
        if((connectionValue & applianceMask)!=0){
            System.out.print("Appliance Active");
        }
        else{
            System.out.print("Application Inactive");
        }
    }
    
}
