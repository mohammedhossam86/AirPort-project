package Employee;

import java.util.Scanner;

import data.PersonalData;
import salay.salary;

public class monthlypaid extends PersonalData implements salary{
int number_of_days ;
double salary_per_day ;
int bonus;
int Days_of_absence;
int Days_of_vacation;
int salary;
int final_salary;
int the_job;
private final String []job = new String[]{"Manager" , "Employee" , "Secretary" , "Accountant"};
private final Double []price_per_day = new Double[]{1000.0 , 1500.0 , 2000.0 };
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
        salary_per_day = (price_per_day[the_job-1]);
        System.out.println("how many days you worked?");
        number_of_days = input.nextInt();
        salary = (int) (number_of_days * salary_per_day);
        System.out.println("how many days you were absent?");
        Days_of_absence = input.nextInt();
        System.out.println("how many days you were on vacation?");
        Days_of_vacation = input.nextInt();
        bonus = (int) (0.3*(number_of_days - ( Days_of_absence + Days_of_vacation + Days_of_absence )));
        final_salary = (salary - (Days_of_absence * (int)salary_per_day) + (Days_of_vacation * (int)salary_per_day) + bonus);
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
        return ("name: " + getFirst_name() + " " + getSecond_name()+ "\n job: " + job[the_job-1]+
        "\n salary: " + salary + " $"+ "\n bonus: " + bonus + " $" + "\ndays of absence: "+Days_of_absence+
         "\ndays of vacation: "+Days_of_vacation + "\nfinal salary: " + final_salary + " $" +
        "\nbank account: " + getBank_account() + "\ntransaction date:" + java.time.LocalDate.now());

    }


    @Override
    public void addsalary() {
        System.out.println( "Your bank account "+getBank_account() + " has been added " + final_salary + " $");
    }



}
