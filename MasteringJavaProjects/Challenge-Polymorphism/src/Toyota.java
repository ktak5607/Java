public class Toyota extends  Car{

        public Toyota (String name){
            super(6, name);
        }
        @Override
        public void startEngine(){
            System.out.println("The Toyota is running.");
        }
        @Override
        public void accelerate(){
            System.out.println("The Toyota is going faster.");
        }
        @Override
        public void brake(){
            System.out.println("The Toyota is slowing down.");
        }

}
