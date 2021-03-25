public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int currentGear;



    public Car(int wheels, int doors, String steering, double speed){
        super(steering, speed);
        this.wheels = wheels;
        this.doors = doors;
        setCurrentGear();
    }
    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }
    private void setCurrentGear() {
        if(super.getSpeed() <= 15 && super.getSpeed() > 0){
            this.currentGear = 1;
        }
        else if(super.getSpeed() > 15 && super.getSpeed() <= 25){
            this.currentGear = 2;
        }
        else if(super.getSpeed() > 25 && super.getSpeed() <= 40){
            this.currentGear = 3;
        }
        else if(super.getSpeed() > 40 && super.getSpeed() <= 55){
            this.currentGear = 4;
        }
        else{
            this.currentGear = 5;
        }
    }
    public int getCurrentGear() {
        return this.currentGear;
    }

    private void shiftGear(){
        if(currentGear == 1 && this.getSpeed() > 15){
            currentGear += 1;
        }
        else if(currentGear == 2 && super.getSpeed() > 25){
            currentGear += 1;
        }
        else if(currentGear == 3 && super.getSpeed() > 40){
            currentGear += 1;
        }
        else if(currentGear == 4 && super.getSpeed() > 55){
            currentGear += 1;
        }
        else{
            System.out.println("The Car is moving too slow to shift");
        }
    }
}
