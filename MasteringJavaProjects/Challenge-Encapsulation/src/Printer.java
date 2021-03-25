public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted = 0;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplexPrinter){
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel: 0;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void fillToner(int amountOfToner){
        if(this.tonerLevel + amountOfToner <= 100){
            this.tonerLevel += amountOfToner;
        }
        else{
            System.out.println("Error: You're trying to add too much toner.");
        }
    }

    public Page printPage(String valueToPrint){
        if(this.tonerLevel - 1 >= 0) {
            Page printedPage = new Page(valueToPrint);
            this.numberOfPagesPrinted += 1;
            this.tonerLevel -= 1;
            return printedPage;
        }
        else{
            System.out.println("Error: Not enough toner to print");
            return new Page();
        }

    }
}
