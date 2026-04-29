public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel=addToner(tonerLevel);
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int TonerAmount){
        tonerLevel+=TonerAmount;
        if((tonerLevel<0)||(tonerLevel>100)){

        return -1;}
        else return tonerLevel;
    }
    public void printPages(int pages){
        int PrintedPages=0;
        if (duplex){
            System.out.println("Duplex is on");
            if (pages%2!=0){
                PrintedPages=pages/2+1;
            }
            else PrintedPages=pages/2;
        }
        else PrintedPages=pages;

        pagesPrinted+=PrintedPages;


        System.out.println("Total no of Pages printed="+pagesPrinted+
                " Printed Page in this round= "+PrintedPages);
    }

    @Override
    public String toString() {
        return "Printer{" +
                "tonerLevel=" + tonerLevel +
                ", pagesPrinted=" + pagesPrinted +
                ", duplex=" + duplex +
                '}';
    }
}
