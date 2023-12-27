public class Person {
//    This class contains details about a person's name, email, date of birth, and address. We shall use this class
//    for users (account holders) and for branch managers.

    //defining instance variables
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String houseAddress;
    private String city;
    private String province;
    private String postalCode;

    // defining the constructor with parameter
    public Person(String firstName, String lastName, String email, String dateOfBirth, String houseAddress
    ,String city, String province, String postalCode){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.houseAddress = houseAddress;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    // returns the name of the person


    public String getFirstName() {
        return firstName;
    }

    public String getCity() {
        return city;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getProvince() {
        return province;
    }

    public String getLastName() {
        return lastName;
    }

    // returns the email of the person.
    public String getEmail(){
        return this.email;
    }

    // returns the date of birth of the person.
    public String getDate(){
        return this.dateOfBirth;
    }

    // returns the address of the person.
    public String getAddress(){
        return this.houseAddress;
    }

    // sets the name to the new name


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // change the email
    public void setEmail(String email){
        this.email = email;
    }

    // change the date of birth
    public void setDate(String date){
        this.dateOfBirth = date;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    // change the address of the person
    public void setAddress(String address) {
        this.houseAddress = address;
    }
}
