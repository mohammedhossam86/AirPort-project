package Employee;

import java.util.Scanner;

import data.PersonalData;
import salay.salary;

public class paybyflight extends PersonalData implements salary {
int number_of_flights ;
double salary_per_flight ;
int the_job;
private final String []job = new String[]{"Pilot" , "Co-Pilot" , "Flight Attendant" , "Flight Engineer"};
private final Double []price_per_flight = new Double[]{1000.0 , 1500.0 , 2000.0 };
int bonus;
int salary;
int final_salary;
Scanner input = new Scanner(System.in);

public void set_personal_data(){
    System.out.println("Enter your first name: ");
    String first_name = input.nextLine();
    setFirst_name(first_name);

    System.out.println("Enter your second name: ");
    String second_name = input.nextLine();
    setSecond_name(second_name);

    System.out.println("Enter your national number: ");
    String nationalnumber = input.nextLine();
    setNationalnumber(nationalnumber);

    System.out.println("Enter your bank account: ");
    String bank_account = input.nextLine();
    setBank_account(bank_account);

    System.out.println("Enter your address: ");
    String address = input.nextLine();
    setAddress(address);

    System.out.println("Enter your phone number: ");
    int phonenumber = input.nextInt();
    setPhonenumber(phonenumber);
    

    }
    @Override
    public void calculateSalary() {
        salary_per_flight = (price_per_flight[the_job-1]);
        System.out.println("how many flights you worked?");
        number_of_flights = input.nextInt();
        salary = (int) (number_of_flights * salary_per_flight);
        bonus = (int) (0.3*(number_of_flights ));
        final_salary = (salary  + bonus);
        System.out.println("Your salary is " + final_salary);
    }
 
    @Override
    public void howareyou() {
        System.out.println("what is your job?");
        for(int i = 0 ; i < job.length ; i++){
            System.out.println(i+1 + " " + job[i]);
        }
        int choice = input.nextInt();
        the_job = choice;
        


    }

    @Override
    public double printSalary() {
        
            return final_salary;
    }

    @Override
    public String printreset() {
        return ("name: " + getFirst_name() + " " + getSecond_name()+ "\njob: " + job[the_job-1]+
        "\nsalary: " + salary + " $" +"\nbonus: " + bonus + " $" + "\nfinal salary: " + final_salary + " $"+
         "Your bank account "+getBank_account() + " has been added " + final_salary + " $" + "\ntransaction date:" + java.time.LocalDate.now());

    }

    @Override
    public void addsalary() {
    System.out.println( "Your bank account "+getBank_account() + " has been added " + final_salary + " $");
    }

}
