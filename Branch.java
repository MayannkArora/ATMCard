public class Branch {
    private int branchNumber;
    private String address;

    private Manager manager;

    public Branch(int branchNumber, String address){
        this.branchNumber = branchNumber;
        this.address=address;
    }

    public void setManager(Manager manager){
        this.manager = manager;
    }
}
