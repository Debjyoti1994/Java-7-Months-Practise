public class Fish extends Animal{
    private int fins;
    private int gills;

    public Fish(String type, double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }
    private void moveMuscles(){
        System.out.println(type+"is moving muscles");
    }
    private void moveBackFins(){
        System.out.println(type+"is moving back fins");
    }

    @Override
    public void move(String speed) {
        moveMuscles();
        if (speed=="fast"){
            moveBackFins();
            System.out.println();

        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
