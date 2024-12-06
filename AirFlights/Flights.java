package AirFlights;

import java.util.Scanner;

public class Flights {
private final String []flights = new String[]{"Cairo" , "Alex" , "Aswan" , "Luxor" , "Sharm El-Sheikh" , "Hurghada" , "Marsa Alam" , "Taba" , "Dahab" , "Nuweiba" , "Ras Sedr" , "Safaga" , "Marsa Matrouh" , "El-Alamein" , "Siwa" , "Fa"};
private final String []flights_time = new String[]{"1:00"  , "7:30" , "8:00" , "9:45" ,  "14:00" , "15:15" ,  "17:00" , "18:30" , "21:00" , "22:45" , "24:00"};
private final String []Classs = new String[]{"Economy" , "Premium Economy", "Business" , "First Class"};
private final String []flights_type = new String[]{"One Way" , "Round Trip"};
private final String []flights_date = new String[]{"1/1/2021" , "2/1/2021" , "3/1/2021"  , "5/1/2021" , "6/1/2021" ,  "8/1/2021" , "10/1/2021" ,  "12/1/2021" , "14/1/2021" , "15/1/2021" ,  "17/1/2021" , "18/1/2021" ,  "21/1/2021" , "22/1/2021" ,  "24/1/2021" ,  "26/1/2021" , "29/1/2021" ,  "31/1/2021"};
// private final String []day = new String[]{"Saturday" , "Sunday" , "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday"};
private final int []price_for_oneway = new int[]{50 , 70 , 100 , 120};
private final int []price_for_roundtrip = new int[]{100 , 140 , 200 , 240};
// private final int []price_for_child = new int[]{25 , 35 , 50 , 60};
private String flight , flight_time , flight_class , flight_type , flight_date ;
private int price , total_price , discounts , balance;
public String print;
public String getprint()
{
    return print;
}
public Flights(){
    flight = "";
    flight_time = ""; 
    flight_class = "";
    flight_type = "";
    flight_date = "";
    price = 0;
    total_price = 0;
    discounts = 0;
    balance = 0;

}

public void setDiscounts(int discounts) {
    this.discounts = discounts;
}

public void Book(){

    System.out.println("___________________________________________________Flights:___________________________________________________");

    for (int i = 1; i <= flights.length; i++) {
        System.out.println( i +": " +flights[i-1] );
    }
    Scanner in = new Scanner(System.in);
    System.out.println("\nEnter the number of flight: ");
    int flight_number = in.nextInt();
    flight = flights[flight_number-1];


    System.out.println("________________________________________________Flights Time:________________________________________________");
    for (int i = 1; i <= flights_time.length; i++) {
        System.out.println( i +": " +flights_time[i-1] );
    }
    System.out.println("\nEnter the number of flight time: ");
    int flight_time_number = in.nextInt();
    flight_time = flights_time[flight_time_number-1];



    System.out.println("________________________________________________Flights Class:_______________________________________________");
    for (int i = 1; i <= Classs.length; i++) {
        System.out.println( i +": " +Classs[i-1] );
    }
    System.out.println("\nEnter the number of flight class: ");
    int flight_class_number = in.nextInt();
    flight_class = Classs[flight_class_number-1];



    System.out.println("_______________________________________________Flights Type:__________________________________________________");
    for (int i = 1; i <= flights_type.length; i++) {
        System.out.println( i +": " +flights_type[i-1] );
    }
    System.out.println("\nEnter the number of flight type: ");
    int flight_type_number = in.nextInt();
    flight_type = flights_type[flight_type_number-1];



    System.out.println("______________________________________________Flights Date:___________________________________________________");
    for (int i = 1; i <= flights_date.length; i++) {
        System.out.println( i +": " +flights_date[i-1] );
    }
    System.out.println("\nEnter the number of flight date: ");
    int flight_date_number = in.nextInt();
    flight_date = flights_date[flight_date_number-1];
    // calculate total price
    if(flight_type_number == 1){
    price = price_for_oneway[flight_class_number-1];
    }
    else if(flight_type_number == 2){
    price = price_for_roundtrip[flight_class_number-1];
    
    }
    while(balance < price){
        System.out.println("you don't have enough money");
        System.out.println("do you want to add money? (y/n)");
        String add_money = in.next();
        while(!add_money.equals("y") && !add_money.equals("n")){
            System.out.println("please enter y or n");
            add_money = in.next();
        }
        if(add_money.equals("y")){
            System.out.println("Enter the amount of money you want to add: ");
            int money = in.nextInt();
            balance += money;
            System.out.println("your balance is: " + balance);
        }
        else if(add_money.equals("n")){
            System.out.println("thank you for using our service");
        }
    }
     if(balance >= price){
        balance -= price;
    }
System.out.println("booking is done successfully");
    total_price = price - (price * discounts / 100);

System.out.println("do you want to print the reset ? (y/n)");
 print = in.next();
while(!print.equals("y") && !print.equals("n")){
    System.out.println("please enter y or n");
    print = in.next();
}   
if(print.equals("y")){
    System.out.println(print_the_reset());
}
else if(print.equals("n")){
    System.out.println("thank you for using our service");
}

}
public void setBalance(int balance) {
    this.balance = balance;
}

public void Query(){
    System.out.println("___________________________________________________Flights:___________________________________________________");
    for (int i = 1; i <= flights.length; i++) {
        System.out.println( i +": " +flights[i-1] );
    }

    System.out.println("________________________________________________Flights Time:________________________________________________");
    for (int i = 1; i <= flights_time.length; i++) {
        System.out.println( i +": " +flights_time[i-1] );
    }
    System.out.println("________________________________________________Flights Class:_______________________________________________");
    for (int i = 1; i <= Classs.length; i++) {
        System.out.println( i +": " +Classs[i-1] );
    }
    System.out.println("_______________________________________________Flights Type:__________________________________________________");
    for (int i = 1; i <= flights_type.length; i++) {
        System.out.println( i +": " +flights_type[i-1] );
    }
    System.out.println("______________________________________________Flights Date:___________________________________________________");
    for (int i = 1; i <= flights_date.length; i++) {
        System.out.println( i +": " +flights_date[i-1] );
    }
    System.out.println("_____________________________________________Flights Price for oneway trips :_____________________________________________");
    for (int i = 1; i <= price_for_oneway.length; i++) {
        System.out.println( i +": " +price_for_oneway[i-1] );
    }
    System.out.println("_____________________________________________Flights Price for roundtrips:_____________________________________________");
    for (int i = 1; i <= price_for_roundtrip.length; i++) {
        System.out.println( i +": " + Classs[i-1]+": "+ price_for_roundtrip[i-1] );
    }



}
public String print_the_reset() {
    return "_______________________________________________________________________Your Ticket__________________________________________________________________\n" + "destination: " + flight + "\n" + "time: " +
     flight_time + "\n" + "class: " + flight_class + "\n" + "type: " + flight_type + "\n" + "date: " +
      flight_date + "\n" +"discounts:"+ discounts + "% \n"+"price: " + price + "L.E"+"\n"+"total price: " +total_price +
        "L.E" +"\n"+ "YOUR CURRENT BALANCE: "+ balance+
         "L.E ";
}
}

