public class SmartKitchen {
    private CoffeMaker theCoffeMaker;
    private DishWasher dishWasher;
    private Refigerator fridge;

    public SmartKitchen(CoffeMaker theCoffeMaker, DishWasher theDishWasher, Refigerator fridge) {
        this.theCoffeMaker = theCoffeMaker;
        this.dishWasher = theDishWasher;
        this.fridge = fridge;
    }

    public SmartKitchen() {
    }

    public CoffeMaker getTheCoffeMaker() {
        return theCoffeMaker;
    }

    public void setTheCoffeMaker(CoffeMaker theCoffeMaker) {
        this.theCoffeMaker = theCoffeMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setDishWasher(DishWasher dishWasher) {
        this.dishWasher = dishWasher;
    }

    public Refigerator getFridge() {
        return fridge;
    }

    public void setFridge(Refigerator fridge) {
        this.fridge = fridge;
    }

    public void addWater(){
        theCoffeMaker.setHasWorkToDo(true);
    }
    public void pourMilk(){
        fridge.setHasWorkToDo(true);
    }public void loadDishWasher(){
        dishWasher.setHasWorkToDo(true);
    }
    public void doKitchenWork(){
        fridge.orderFood();
        dishWasher.doDishes();
        theCoffeMaker.brewCoffe();
    }
}
