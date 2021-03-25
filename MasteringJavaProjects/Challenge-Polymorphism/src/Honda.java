public class Honda extends  Car{

    public Honda (String name){
        super(6, name);
    }
    @Override
    public void startEngine(){
        System.out.println("The Honda is running.");
    }
    @Override
    public void accelerate(){
        System.out.println("The Honda is going faster.");
    }

}
