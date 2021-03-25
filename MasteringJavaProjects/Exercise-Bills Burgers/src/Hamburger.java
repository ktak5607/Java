public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;
    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        if(this.name == "Deluxe Burger"){
            System.out.println(this.name + " on a " + this.breadRollType +
                    " bun with " + this.meat + " is " + this.price);
            System.out.println("Add chips for an extra 2.75");
            System.out.println("Add a drink for an extra 1.81");
            return this.price;
        }
        else if(this.name ==  "Healthy Burger") {
            System.out.println(this.name + " on a " + this.breadRollType +
                    " bun with " + this.meat + " is " + this.price);
            return this.price;
        }
        else{
            double total = this.price;
            System.out.println(this.name + " on a " + this.breadRollType +
                    " bun with " + this.meat + " is " + this.price);
            if(this.addition1Name != null){
                System.out.println("Add " + this.addition1Name + " for " + this.addition1Price);
                total += addition1Price;
            }
            if(this.addition2Name != null){
                System.out.println("Add " + this.addition2Name + " for " + this.addition2Price);
                total += addition2Price;
            }
            if(this.addition3Name != null){
                System.out.println("Add " + this.addition3Name + " for " + this.addition3Price);
                total += addition3Price;
            }
            if(this.addition4Name != null){
                System.out.println("Add " + this.addition4Name + " for " + this.addition4Price);
                total += addition4Price;
            }
            return total;
        }

    }

}
