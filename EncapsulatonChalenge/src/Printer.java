public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel>0 && tonerLevel<100)?tonerLevel:-1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
        tonerLevel+=tonerAmount;
        if((tonerLevel>100)||(tonerLevel<0)){
            return -1;
        }
        return tonerLevel;

    }
    public  int printPages(int pages){
//        if (duplex==true){
//            pages/=2;
//            System.out.println("Its a duplex Printer");
//        }
//        pagesPrinted+=pages;
        int jobPages=(duplex)?(pages/2)+(pages%2):pages;
        pagesPrinted+=jobPages;
        return jobPages;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
