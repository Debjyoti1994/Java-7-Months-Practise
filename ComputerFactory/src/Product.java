public class Product {
    private String model;
    private String manufacture;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacture) {
        this.model = model;
        this.manufacture = manufacture;
    }
}

class Monitor extends Product{
    private int size;
    private String resolution;



    public Monitor(String model, String manufacture) {
        super(model, manufacture);}

    public Monitor(String model, String manufacture, int size, String resolution) {
        super(model, manufacture);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x,int y,String colour ){
        System.out.printf("This resolution contains %d and %d in %s colour",x,y,colour);
    }
    }
class Motherboard extends Product{
    private int ramSlots;
    private int cardSots;
    private String bios;


    public Motherboard (String model, String manufacture) {
        super(model, manufacture);
    }

    public Motherboard(String model, String manufacture, int ramSlots, int cardSots, String bios) {
        super(model, manufacture);
        this.ramSlots = ramSlots;
        this.cardSots = cardSots;
        this.bios = bios;
    }
    public void localProgram(String programName){
        System.out.println("The program "+programName+" is being loaded");
    }
}
class ComputerCase extends Product{
    String powerSupply;

    public ComputerCase(String model, String manufacture, String powerSupply) {
        super(model, manufacture);
        this.powerSupply = powerSupply;
    }

    public ComputerCase (String model, String manufacture) {
        super(model, manufacture);
    }
    public void pressPowerButton(){
        System.out.println("The power supply is  on");
    }
}



