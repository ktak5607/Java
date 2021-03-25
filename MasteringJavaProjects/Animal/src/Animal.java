public class Animal {
    private int brain;
    private double weight;
    private int body;
    private int size;
    private String name;

    public Animal(int brain, double weight, int body, int size, String name) {
        this.brain = brain;
        this.weight = weight;
        this.body = body;
        this.size = size;
        this.name = name;
    }

    public void eat(){
        System.out.println("It's eating");
    }
    public void move(int speed){
        System.out.println("It's moving at " + speed);
    }

    public int getBrain() {
        return brain;
    }

    public double getWeight() {
        return weight;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
