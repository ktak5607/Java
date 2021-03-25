public class VIPCustomer {
    private String name;
    private double limit;
    private String email;

    public VIPCustomer(String nm, double lim, String eml){
        this.name = nm;
        this.limit = lim;
        this.email = eml;
    }
    public VIPCustomer(){
        this("John Doe", 0.0, "name@email.com");
    }
    public VIPCustomer(String nm, double lim){
        this(nm, lim, "name@email.com");
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
