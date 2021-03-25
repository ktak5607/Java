public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public void setFirstName(String firstName1){
        this.firstName = firstName1;
    }
    public void setLastName(String lastName1){
        this.lastName = lastName1;
    }
    public void setAge(int age1){
        if(age1 >= 0 && age1 <= 100){
            this.age = age1;
        }
        else{
            this.age = 0;
        }
    }
    public boolean isTeen(){
        if(this.age > 12 && this.age < 20){
            return true;
        }
        else{
            return false;
        }
    }
    public String getFullName(){
        if(this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        }
        else if(!this.firstName.isEmpty() && this.lastName.isEmpty()){
            return this.firstName;
        }
        else if (this.firstName.isEmpty() && !this.lastName.isEmpty()){
            return this.lastName;
        }
        else{
            return this.firstName + " " + this.lastName;
        }
    }

}
