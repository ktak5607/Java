public class Car{
    private boolean engine;
    private int wheels;
    private int cylinders;
    private String name;

    public Car(int cylinders, String name){
        this.wheels = 4;
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
    }
    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine(){
        System.out.println("Vroom Vroom. The car is started");
    }

    public void accelerate(){
        System.out.println("The car is going faster.");
    }
    public void brake(){
        System.out.println("The car is slowing down.");
    }
}