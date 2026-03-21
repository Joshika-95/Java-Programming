import java.util.Scanner;
public class HotelRoomOccupancyTracker {
    public static void main(String[] args) {
        Scanner p5=new Scanner(System.in);
        int n=p5.nextInt();
        double totalRate=0;
        int fullDays=0;
        double maxRate=0;
        int peakday=0;
        for(int i=0;i<n;i++){
            int day=p5.nextInt();
            int roomsOccupied=p5.nextInt();
            int totalRooms=p5.nextInt();
            double occupancyRate=((double)roomsOccupied/totalRooms)*100;
            totalRate+=occupancyRate;
            String status="";
            if(occupancyRate<60){
                status="Low";
            }
            else if(occupancyRate>=60 && occupancyRate>=79){
                status="Moderate";
            }
            else if(occupancyRate>=80 && occupancyRate<=99){
                status="High";
            }
            else if(occupancyRate==100){
                status="Full";
            }
            if(occupancyRate>maxRate){
                maxRate=occupancyRate;
                peakday=day;
            }
            System.out.println("Day: "+day);
            System.out.println("Rooms Occupied: "+roomsOccupied);
            System.out.println("Total Rooms: "+totalRooms);
            System.out.println("Occupancy Rate: "+occupancyRate+"%");
            System.out.println("Status: "+status);
            System.out.println();
        }
        double avgRate=totalRate/n;
        System.out.println("Total Days Analyzed: "+n);
        System.out.println("Average Occupancy Rate: "+avgRate+"%");
        System.out.println("Peak Occupancy Day: Day"+peakday);
        System.out.println("Days at Full Capacity: "+fullDays);
    }
}
