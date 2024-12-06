
import java.util.Scanner;

import AirFlights.*;
import passenger.*;
import Employee.*;
public class Reseption {
public static void main(String[] args) {
do
{System.out.println("________________________________Hello to our Airline_________________________");
System.out.println("first of all are you a passenger or an employee?");
System.out.println("1- employee");
System.out.println("2- passenger");
System.out.println("3- exit");
Scanner input = new Scanner(System.in);
int choice = input.nextInt();
switch (choice) {
    case 1:
    System.out.println("how can we help you?");
    System.out.println("1- Receive salary");
    int choice2 = input.nextInt();
    switch (choice2) {
        case 1:
            System.out.println("what kind of employee are you?");
            System.out.println("1- daily employee");
            System.out.println("2- monthly employee");
            System.out.println("3- by flight");
            int choice3 = input.nextInt();
            switch (choice3) {
                case 1:
                    dailypaied d1 = new dailypaied();
                    d1.set_personal_data();
                    d1.howareyou();
                    d1.calculateSalary();
                    System.out.println("how can we help you mr/mrs " + d1.getFirst_name() + " ?");
                    System.out.println("1- print your salary");
                    System.out.println("2- print your salary and reset it");
                    int choice4 = input.nextInt();
                    switch (choice4) {
                        case 1:
                            System.out.println("your salary is " + d1.printSalary());
                            break;
                        case 2:
                            System.out.println(d1.printreset());
                            break;
                        default:
                            break;
                    }
                    
                    break;
                case 2:
                    monthlypaid m1 = new monthlypaid();
                    m1.set_personal_data();
                    m1.howareyou();
                    m1.calculateSalary();
                    System.out.println("how can we help you mr/mrs " + m1.getFirst_name() + " ?");
                    System.out.println("1- print your salary");
                    System.out.println("2- print your salary and reset it");
                    int choice5 = input.nextInt();
                    switch (choice5) {
                        case 1:
                            System.out.println("your salary is " + m1.printSalary());
                            break;
                        case 2:
                            System.out.println(m1.printreset());
                            break;
                        default:
                        System.out.println("unvalid choice");
                            break;
                    }
                    break;
                case 3:
                    paybyflight pbf1 = new paybyflight();
                    pbf1.set_personal_data();
                    pbf1.howareyou();
                    pbf1.calculateSalary();
                    System.out.println("how can we help you mr/mrs " + pbf1.getFirst_name() + " ?");
                    System.out.println("1- print your salary");
                    System.out.println("2- print your salary and reset it");
                    int choice6 = input.nextInt();
                    switch (choice6) {
                        case 1:
                            System.out.println("your salary is " + pbf1.printSalary());
                            break;
                        case 2:
                            System.out.println(pbf1.printreset());
                            break;
                        default:
                           System.out.println("unvalid choice");

                            break;
                    }    

                    break;
                default:
                System.out.println("unvalid choice");
                    break;
            }
            break;
    
        default:
        System.out.println("unvalid choice");
            break;
    }
       break;
    case 2:
        passenger p2 = new passenger();
        p2.set_personal_data();
        System.out.println("how can we help you mr/mrs "+ p2.getFirst_name() + "?");
        System.out.println("1- book a flight");
        System.out.println("2- query the flights");
        Scanner op = new Scanner(System.in);
        int choice7 = op.nextInt();
        switch (choice7) {
            case 1:
                p2.bookflight();
                break;
            case 2:
                p2.queryflights();
                System.out.println("do you want to book a flight now?");
                System.out.println("1- yes");
                System.out.println("2- no");
                int choice8 = op.nextInt();
                switch (choice8) {
                    case 1:
                        p2.bookflight();
                        break;
                    case 2:
                        System.out.println("thank you for using our program");
                        // System.exit(0);
                        break;
                    default:
                    System.out.println("unvalid choice");
                        break;
                }
                break;
            default:
            System.out.println("unvalid choice");
                break;
        }
        break;
    case 3:
        System.out.println("thank you for using our program");
        System.exit(0);
}



}while(true);





























}
}

