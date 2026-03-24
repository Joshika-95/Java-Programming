import java.util.Scanner;
public class LibraryBookFineCalculator {
    public static void main(String[] args) {
        Scanner p14=new Scanner(System.in);
        int n=p14.nextInt();
        int count=0;
        double totalFine=0;
        for(int i=0;i<n;i++){
            String bookType=p14.next();
            double daysLate=p14.nextInt();
            double fineRate=0;
            double fineCap=0;
            if(bookType.equals("Regular")){
                fineRate=0.50;
                fineCap=10;
            }
            else if(bookType.equals("Reference")){
                fineRate=1.00;
                fineCap=20;
            }
            else if(bookType.equals("Magazine")){
                fineRate=0.25;
                fineCap=5;
            }
            double fine=daysLate*fineRate;
            boolean capApplied=false;
            if(fine>fineCap){
                fine=fineCap;
                capApplied=true;
            }
            if(daysLate>0){
                count++;
            }
            totalFine+=fine;
            System.out.println("Book "+i+": "+bookType);
            System.out.println("Days Late: "+daysLate);
            System.out.println("Daily Fine: $"+fineRate);
            System.out.println("Calculated Fine: $"+fine);
            System.out.println("Actual Fine: $"+fine);
            System.out.println("Cap Applied:"+(capApplied ? "Yes": "No"));
        }
        double averageFine=totalFine/n;
        System.out.println("Total Book: "+n);
        System.out.println("Total Fines Collected: $"+totalFine);
        System.out.println("Books Overdue: "+count);
        System.out.println("Average Fine: $"+averageFine);
    }
}
