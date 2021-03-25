public class Main {

    public static void main(String[] args) {
        Car car = new Car(6, "Unknown");
        Toyota toyota = new Toyota("Camry");
        Ford ford =  new Ford("Taurus");
        Honda honda =  new Honda("Civic");

        car.startEngine();
        car.accelerate();
        car.brake();

        ford.startEngine();
        ford.accelerate();
        ford.brake();

        toyota.startEngine();
        toyota.accelerate();
        toyota.brake();

        honda.startEngine();
        honda.accelerate();
        honda.brake();

    }

}
