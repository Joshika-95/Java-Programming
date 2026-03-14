import java.util.Scanner;
public class ShippingCostDeliveryTimeCalculator {
    public static void main(String[] args) {
        Scanner p18=new Scanner(System.in);
        double weight=p18.nextDouble();
        String Zone=p18.next();
        String speed=p18.next();
        String size=p18.next();
        double baseRate=0;
        double surcharge=0;
        double multiplier=0;
        double sizeSurcharge=0;
        String serviceLevel="";
        int deliveryTime=0;
        if(speed.equals("Economy")){
            baseRate=5;
            serviceLevel="Budget";
        }
        else if(speed.equals("Standard")){
            baseRate=10;
            serviceLevel="Standard";
        }
        else if(speed.equals("Express")){
            baseRate=25;
            serviceLevel="Priority";
        }
        else if(speed.equals("Overnight")){
            baseRate=50;
            serviceLevel="Premium";
        }
        surcharge=weight*1.0;
        if(Zone.equals("Local")){
            multiplier=1.0;
        }
        else if(Zone.equals("Regional")){
            multiplier=1.2;        
        }
        else if(Zone.equals("National")){
            multiplier=1.5;
        }
        else if(Zone.equals("International")){
            multiplier=3.0;
        }
        if(size.equals("Small")){
            sizeSurcharge=0;
        }
        else if(size.equals("Medium")){
            sizeSurcharge=5;
        }
        else if(size.equals("Large")){
            sizeSurcharge=15;
        }
        else if(size.equals("Oversized")){
            sizeSurcharge=30;
        }
        double baseCost=(baseRate+surcharge)*multiplier;
        double totalCost=baseCost+sizeSurcharge;
        if(speed.equals("Economy")){
            if(Zone.equals("Local")){
                deliveryTime=7;
            }
            else if(Zone.equals("Regional")){
                deliveryTime=5;
            }        
            else if(Zone.equals("National")){
                deliveryTime=10;
            }
            else if(Zone.equals("International")){
                deliveryTime=21;
            }
        }
        else if(speed.equals("Standard")){
            if(Zone.equals("Local")){
                deliveryTime=2;
            }
            else if(Zone.equals("Regional")){
                deliveryTime=5;
            }
            else if(Zone.equals("National")){
                deliveryTime=7;
            }
            else if(Zone.equals("Internaltiona")){
                deliveryTime=14;
            }
        }
        else if(speed.equals("Express")){
            if(Zone.equals("Local")){
                deliveryTime=1;
            }
            else if(Zone.equals("Regional")){
                deliveryTime=1;
            }
            else if(Zone.equals("National")){
                deliveryTime=2;
            }
            else if(Zone.equals("International")){
                deliveryTime=3;
            }
        }
        else if(speed.equals("Overnight")){
            if((Zone.equals("Local")) || (Zone.equals("Regional")) || (Zone.equals("National")) || (Zone.equals("International"))){
                deliveryTime=1;
            }
        }
        System.out.println("Pacakage Weight: "+weight+"lbs");
        System.out.println("Destination Zone: "+Zone);
        System.out.println("Shipping Speed: "+speed);
        System.out.println("Package Size: "+size);
        System.out.println("Base Shipping Rate: $"+baseRate);
        System.out.println("Weight Surcharge: $"+surcharge);
        System.out.println("Zone Multiplier: "+multiplier+"x");
        System.out.println("Size Surcharge: "+sizeSurcharge);
        System.out.println("Total Shipping Cost: "+totalCost);
        System.out.println("Estimated Delivery: "+deliveryTime+"business days");
        System.out.println("Service Level: "+serviceLevel);
    }
}

