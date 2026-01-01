public class Main {
    public static void main(String[] args) {
        Printer myPrinter =new Printer(50,false);
//        System.out.println("The current toner level "+myPrinter.addToner(45));
//        myPrinter.printPages(60);
////        myPrinter.tonerLevel=24;
//
//        System.out.println("The total no of pages printed "+ myPrinter.getPagesPrinted());

        System.out.println("Initial page count: "+myPrinter.getPagesPrinted());
        int pagesPrinted= myPrinter.printPages(5);
        System.out.printf("Current job page :%d,Print total :%d%n",pagesPrinted,myPrinter.getPagesPrinted());
        pagesPrinted= myPrinter.printPages(10);
        System.out.printf("Current job page :%d,Print total :%d%n",pagesPrinted,myPrinter.getPagesPrinted());
    }
}
