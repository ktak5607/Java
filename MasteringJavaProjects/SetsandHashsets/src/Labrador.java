public class Labrador extends Dog{
    public Labrador(String name) {
        super(name);
    }

//don't override equals in subclass
//    @Override
//    public boolean equals(Object obj){
//        if(obj == this){
//            return true;
//        }
//        if(obj instanceof Labrador){
//            String objName = ((Labrador)obj).getName();
//            return this.getName().equals(objName);
//        }
//        return false;
//    }
}
