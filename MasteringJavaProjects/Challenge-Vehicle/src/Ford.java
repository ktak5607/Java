public class Ford extends Car{
    private String model;
    public Ford(int doors, String steering, double speed, String model){
        super(4, doors, "power", 120);
        this.model = model;
    }
}
