public class Manager extends Person{
    private int ID;
    public Manager(String firstName, String lastName, String email, String dateOfBirth, String houseAddress
            ,String city, String province, String postalCode, int ID) {
        super(firstName,lastName,email,dateOfBirth,houseAddress,city,province,postalCode);
        this.ID=ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }
}
