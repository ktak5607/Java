public class HealthyBurger  extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price){
        super("Healthy Burger", meat, price, "wheat");
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double total = super.itemizeHamburger();
        if(this.healthyExtra1Name != null){
            System.out.println("Add " + this.healthyExtra1Name + " for " + this.healthyExtra1Price);
            total += healthyExtra1Price;
        }
        if(this.healthyExtra2Name != null){
            System.out.println("Add " + this.healthyExtra2Name + " for " + this.healthyExtra2Price);
            total += healthyExtra2Price;
        }
        return total;
    }
}
