package data;


public class PersonalData {
private String first_name , second_name , nationalnumber , bank_account , address ;
private int phonenumber ;
public PersonalData(String first_name, String second_name, String nationalnumber, String bank_account, String address,
        int phonenumber) {
    this.first_name = first_name;
    this.second_name = second_name;
    this.nationalnumber = nationalnumber;
    this.bank_account = bank_account;
    this.address = address;
    this.phonenumber = phonenumber;
}
public PersonalData() {
}
public String getFirst_name() {
    return first_name;
}
public void setFirst_name(String first_name) {
    this.first_name = first_name;
}
public String getSecond_name() {
    return second_name;
}
public void setSecond_name(String second_name) {
    this.second_name = second_name;
}
public String getNationalnumber() {
    return nationalnumber;
}
public void setNationalnumber(String nationalnumber) {
    this.nationalnumber = nationalnumber;
}
public String getBank_account() {
    return bank_account;
}
public void setBank_account(String bank_account) {
    this.bank_account = bank_account;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
public int getPhonenumber() {
    return phonenumber;
}
public void setPhonenumber(int phonenumber) {
    this.phonenumber = phonenumber;
}

}
