public class Dog extends Animal {

    private int eyes;
    private int tail;
    private int legs;
    private int teeth;
    private String coat;

    public Dog(double weight, int size, String name, int eyes, int tail, int legs, int teeth, String coat){
        super(1, weight, 1, size, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.coat = coat;
        this.teeth =  teeth;
    }

    private void chew(){
        System.out.println("The dog is chewing");
    }

    @Override
    public void eat(){
        System.out.println("The dog is eating");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("The dog is walking");
        super.move(5);
    }
    public void run(){
        System.out.println(("The dog is running"));
        move(10);
    }
    private void moveLegs(){
        System.out.println("It's legs are moving really fast.");
    }
    @Override
    public void move(int speed) {
        System.out.println("The dog is moving at " + speed);
        moveLegs();
        //super.move(speed);
    }
}
