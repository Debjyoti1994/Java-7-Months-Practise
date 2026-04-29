public class SmartKitchen {
    private Coffeemaker  brewmaster;
    private Refigerator icebox;
    private DishWasher dishWasher;

    public SmartKitchen(){
        brewmaster=new Coffeemaker();
        icebox=new Refigerator();
        dishWasher=new DishWasher();
    }

    public Coffeemaker getBrewmaster() {
        return brewmaster;
    }

    public Refigerator getIcebox() {
        return icebox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setKitchenState( boolean Coffeflag,boolean Refflag,boolean Dishflag){
        brewmaster.setHasWorkToDo(Coffeflag);
        icebox.setHasWorkToDo(Refflag);
        dishWasher.setHasWorkToDo(Dishflag);
    }
    public void doKitchhenWork(){
        brewmaster.brewCoffee();
        icebox.orderFood();
        dishWasher.doDishes();

    }
}
class Coffeemaker{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.println("Brewing Hot Coffee");
            hasWorkToDo=false;
        }
    }
}
class Refigerator{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("Ordering Food");
            hasWorkToDo=false;
        }
    }
}
class DishWasher{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes(){
        if (hasWorkToDo){
            System.out.println("Turning on Dishwasher");
            hasWorkToDo=false;
        }
    }
}