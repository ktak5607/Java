public class Main {

    public static void main(String[] args) {
	    Animal animal =  new Animal(1, 100, 1, 1, "Unknown");
	    Dog dog = new Dog(58, 1, "Lab", 2, 1, 4, 32, "Short");
	    dog.eat();
	    dog.walk();
	    dog.run();
	    Dog chow = new Dog(101, 1, "Scott", 2, 1, 4, 32, "Long");
	    Dog wendy = chow;
		System.out.println(wendy.getName());
    }
}
