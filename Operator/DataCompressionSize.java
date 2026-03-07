import java.util.Scanner;
public class DataCompressionSize {
    public static void main(String[] args) {
        Scanner s12=new Scanner(System.in);
        int fileSize=s12.nextInt();
        int compressionCycles=s12.nextInt();
        int compressedSize=fileSize >> compressionCycles;
        System.out.print("Compressed Size: "+compressedSize);
    }
    
}
