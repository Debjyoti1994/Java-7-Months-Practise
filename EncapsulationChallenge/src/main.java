public class main {
    public static void main(String[] args) {
    Printer Laserprinter=new Printer(0,0,true);
        System.out.println(Laserprinter);
        Laserprinter.addToner(50);
        Laserprinter.printPages(51);
        Laserprinter.printPages(50);

    }


}
