public class Printer {
    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel = (tonerLevel > -1 && tonerLevel < 101) ? tonerLevel: -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if((tonerAmount > 0 && tonerAmount < 101) && (this.tonerLevel + tonerAmount <= 100)){
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
        else{
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(duplex) {
            pagesToPrint = pages / 2 + pages % 2;
            pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }
        else{
            pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }

    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }

}
