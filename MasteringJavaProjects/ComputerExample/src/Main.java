public class Main {

    public static void main(String[] args) {
        Dimension dim  = new Dimension(20, 25, 3);
	    Case case1 = new Case("111", "Dell", "240V", dim);
	    Monitor theMonitor = new Monitor("27 inch beast", "Acer", 27, new Resolution(2540, 1440));
	    MotherBoard motherBoard =  new MotherBoard("B-120", "Asus", 4, 6, "2.4");
	    PC pc =  new PC(case1, theMonitor, motherBoard);
	    pc.powerUp();
    }
}
