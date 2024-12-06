package Employee;
import java.util.Scanner;
import data.PersonalData;
import salay.salary;
public class dailypaied extends PersonalData implements salary {
int days ;
double salary_per_day ;
int the_job;
double salary;
private final String []job = new String[]{"Cleaner" , "Maintenance worker" , "Driver" };
private final Double []price_per_day = new Double[]{100.0 , 150.0 , 200.0 };
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
        days = input.nextInt();
        salary = (days * salary_per_day);
        addsalary();
        
    }
 

    @Override
    public void howareyou() {
        System.out.println("what is your job?");
        for(int i = 0 ; i < job.length ; i++){
            System.out.println(i+1 + " " + job[i]);
        }
        int ce = input.nextInt();
        the_job = ce;
    }


    @Override
    public double printSalary() {
        return salary;

    }


    @Override
    public String printreset() {
        return ("name: " + getFirst_name() + " " + getSecond_name()+ "\njob: " + job[the_job-1]+
        "\nsalary: " + salary + " $"+ "\nbank account: " + getBank_account() + "\ntransaction date:" + java.time.LocalDate.now());

    }


    @Override
    public void addsalary() {
        System.out.println( "Your bank account "+getBank_account() + " has been added " + salary + " $");
    }


    



}
