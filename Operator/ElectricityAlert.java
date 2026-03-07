import java.util.Scanner;
public class ElectricityAlert {
    public static void main(String[] args) {
        Scanner s10=new Scanner(System.in);
        int unitsConsumed=s10.nextInt();
        int voltageFluctuation=s10.nextInt();
        if(unitsConsumed>500 || voltageFluctuation==1){
            System.out.print("Alert Triggered");
        }
        else{
            System.out.print("Normal Usage");
        }
    }
}
