package passenger;
import data.PersonalData;

import java.util.Scanner;

import AirFlights.*;

public class passenger extends PersonalData{
int age , Balance;

public passenger() {
}
Scanner input = new Scanner(System.in);
Flights f = new Flights();

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

    System.out.println("Enter your age: ");
    int age = input.nextInt();
    setAge(age);
        System.out.println("your data has been saved successfully\n");
}
public passenger(int age, int Balance) {
    this.age = age;
    this.Balance = Balance;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

public int getBalance() {
    return Balance;
}

public void setBalance(int Balance) {
    this.Balance = Balance;
}

public String print_the_reset() {
    return
    "_______________________________________________________________________Personal information__________________________________________________________________\n" +
    "name: " + getFirst_name() + " " + getSecond_name() +"\n"+ "national number: " + getNationalnumber() +
     "\n" + "phone number: " + getPhonenumber() +"\n"+ "bank acount: " + getBank_account() +
     "\n_______________________________________________________________DO NOT SHARE THIS WITH ANYBODY_______________________________________________________\n" ;

}
public void calculateDiscount()
{
    if(age <= 15)
{
    System.out.println("you have 50% discount");
    f.setDiscounts(50);
}
else if(age >= 60)
{
    System.out.println("you have 25% discount");
    f.setDiscounts(25);
}
else
{
    System.out.println("you have no discount");
    f.setDiscounts(0);
}
}

public void bookflight()
{
    System.out.println("Enter your Balance: ");
    int Balance = input.nextInt();
    setBalance(Balance);
    f.setBalance(Balance);
    calculateDiscount();
    f.Book();
if(f.getprint().equals("y"))
System.out.println(print_the_reset());    

    
}
public void queryflights()
{
    f.Query();
}
}
