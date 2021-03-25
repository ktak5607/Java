public class Fish extends Animal {
    private int fins;
    private int gills;
    private int eyes;

    public Fish(double weight, int size, String name, int fins, int gills, int eyes) {
        super(1, weight, 1, size, name);
        this.fins = fins;
        this.gills = gills;
        this.eyes = eyes;
    }

    private void rest(){

    }
    private void moveMuscles(){
        System.out.println("The fish is moving it's muscles");
    }
    private void moveBackFin(){
        System.out.println("The fishes back fin is moving");
    }
    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

}
