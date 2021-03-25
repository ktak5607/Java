public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj instanceof Dog){
            String objName = ((Dog)obj).getName();
            return this.name.equals(objName);
        }
        return false;
    }
}
