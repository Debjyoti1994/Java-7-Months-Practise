public class fish extends Animal {
    private int fins;
    private int gills;

    public fish(String type,
                double weight, int fins, int gills) {
        super(type,"small", weight);
        this.fins = fins;
        this.gills = gills;
    }
    public void moveMuscles(){
        System.out.println("muscles moving");
    } public void moveBackFin(){
        System.out.println("Back fin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed=="fast"){
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
