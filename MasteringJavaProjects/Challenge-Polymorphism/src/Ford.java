public class Ford extends Car{
    public Ford (String name){
        super(4, name);
    }
    @Override
    public void startEngine(){
        System.out.println("The Ford is running.");
    }
    @Override
    public void accelerate(){
        System.out.println("The Ford is going faster.");
    }
    @Override
    public void brake(){
        System.out.println("The Ford is slowing down.");
    }
}