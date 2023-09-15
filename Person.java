public class Person {
//    This class contains details about a person's name, email, date of birth, and address. We shall use this class
//    for users (account holders) and for branch managers.

    //defining instance variables
    private String name;
    private String email;
    private String date;
    private String address;

    // defining the constructor with parameter
    public Person(String name, String email, String date, String address){
        this.name = name;
        this.email = email;
        this.date = date;
        this.address = address;
    }

    // returns the name of the person
    public String getName(){
        return this.name;
    }

    // returns the email of the person.
    public String getEmail(){
        return this.email;
    }

    // returns the date of birth of the person.
    public String getDate(){
        return this.date;
    }

    // returns the address of the person.
    public String getAddress(){
        return this.address;
    }

    // sets the name to the new name
    public void setName(String name){
        this.name = name;
    }

    // change the email
    public void setEmail(String email){
        this.email = email;
    }

    // change the date of birth
    public void setDate(String date){
        this.date = date;
    }

    // change the address of the person
    public void setAddress(String address) {
        this.address = address;
    }
}
