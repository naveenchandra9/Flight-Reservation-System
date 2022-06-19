package airline;
import java.util.Scanner;

class flightList {
        void flightList(){
                    System.out.println("         FROM       ------>            TO         ");
                    System.out.println("1.Belagavi    (IXG) ------>   Bangalore     (BLR)");
                    System.out.println("2.Belagavi    (IXG) ------>   Chennai       (MAA)");
                    System.out.println("3.Belagavi    (IXG) ------>   Mumbai        (BOM)");
                    System.out.println("4.Belagavi    (IXG) ------>   Goa           (GOI)");
                    System.out.println("5.Belagavi    (IXG) ------>   Delhi         (DEL)");
                    System.out.println("6.Belagavi    (IXG) ------>   Hyderabad     (HYD)");
                    System.out.println("7.Belagavi    (IXG) ------>   Tirupati      (TIR)");
        }              
}


class seatsAvailable extends flightList{
        void seatsAvailable(int []arr){
            Scanner in1 = new Scanner(System.in);
            flightList();
            System.out.println("Choose flight from above: ");
            int ch = in1.nextInt();
            if(ch==1){
                System.out.println("Seats Available are: " + arr[0]);
            }
            else if(ch==2){
                System.out.println("Seats Available are: " + arr[1]);
            }
            else if(ch==3){
                System.out.println("Seats Available are: " + arr[2]);
            }
            else if(ch==4){
                System.out.println("Seats Available are: " + arr[3]);
            }
            else if(ch==5){
                System.out.println("Seats Available are: " + arr[4]);
            }
            else if(ch==6){
                System.out.println("Seats Available are: " + arr[5]);
            }
            else if(ch==7){
                System.out.println("Seats Available are: " + arr[6]);
            } 
        }
}

class bookTicket extends flightList{
    Scanner in2 = new Scanner(System.in);
    void bookTickets(String seatNumber, String seatClass, int flightNum, String []arr1, int []arr){
        int ch;
        flightList();
        System.out.println("Choose a Flight: ");
        flightNum = in2.nextInt();
        System.out.println("Select Seat Type: ");
        System.out.println("1:ECONOMY");
        System.out.println("2:BUSINESS");
        ch = in2.nextInt();
        if(ch == 1){
            seatClass = "ECONOMY";
        }
        else{
            seatClass = "BUSINESS";
        }
        
        seatNumber = arr1[flightNum-1];
        arr[flightNum-1] = arr[flightNum - 1] - 1;
        print(seatNumber, seatClass, flightNum, arr1);
    }
    void print(String seatNumber, String seatClass, int flightNum, String []arr1){
        System.out.println("------------------");
        System.out.println("YOUR BOARDING PASS");
        System.out.println("------------------");
        System.out.println("Flight No. " + flightNum);
        System.out.println("Seat No. "+ seatNumber);
        System.out.println("Class "+ seatClass);
    }
}




public class Airline {
    public static void main(String[] args) {
        String seatClass ="";
        String seatNumber="";
        int flightNum = 0;
       
        Scanner in = new Scanner(System.in);
       
        int arr[] ={172, 40, 88, 98, 121, 28, 4};
        String arr1[] ={"24E", "32F", "42A", "74F", "12A", "64B", "90C"};
       
        System.out.println("Welcome to Belagavi Airport");
        
        while(true){
            System.out.println("");
            System.out.println("1:List of Available Flights");
            System.out.println("2:Check Seat Availability");
            System.out.println("3:Book your Seat");
            System.out.println("4.EXIT");
            System.out.println("\nEnter your choice: ");
       
            int choice =in.nextInt();
            switch(choice){
                case 1: flightList f1 = new flightList();
                        f1.flightList();
                        break;
                case 2: seatsAvailable s1 = new seatsAvailable();
                        s1.seatsAvailable(arr);
                        break;
                case 3: bookTicket b1 = new bookTicket();
                        b1.bookTickets(seatNumber,seatClass,flightNum,arr1,arr);
                        break;
                case 4 :System.exit(0);
           
            }
        }
    }
}
