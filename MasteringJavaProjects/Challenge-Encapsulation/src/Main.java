public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(50, 0, false);
	    Page firstPage = printer.printPage("Hello");
        System.out.println(firstPage.getPageText());
        System.out.println(printer.getTonerLevel());
    }
}
