import java.util.Scanner;
public class DigitalSignalToggleController {
    public static void main(String[] args) {
        Scanner s15=new Scanner(System.in);
        int signalValue=s15.nextInt();
        int toggleMask=s15.nextInt();
        int toogledSignal=signalValue^toggleMask;
        System.out.print("Toogled Signal: "+toogledSignal);
    }
    
}
