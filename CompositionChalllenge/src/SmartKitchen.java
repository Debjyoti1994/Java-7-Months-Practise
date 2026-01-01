public class SmartKitchen {
    public Dishwasher dishwasher;
    public CoffeeMaker brewmaster;
    public Refrigerator icebox;



    public SmartKitchen() {
        brewmaster=new CoffeeMaker();
        dishwasher=new Dishwasher();
        icebox=new Refrigerator();
    }

    public Dishwasher getDishwasher() {
        return dishwasher;
    }

    public CoffeeMaker getBrewmaster() {
        return brewmaster;
    }

    public Refrigerator getIcebox() {
        return icebox;
    }
    //    public SmartKitchen(Dishwasher dishwasher) {
//    }

    //Settingg work true for each class
    public void addWater() {
        brewmaster.brewCoffee();

    }

    public void pourMilk() {
//        Refrigerator icebox = new Refrigerator(true);
        icebox.orderFood();

    }

    public void loadDishwasher() {
        dishwasher.doDishes();

    }
    public void kitchenState(boolean diswasherFlag,boolean iceboxFlag,boolean brewmasterFlag){
        dishwasher.setHasWorkToDo(diswasherFlag);
        icebox.setHasWorkToDo(iceboxFlag);
        brewmaster.setHasWorkToDo(brewmasterFlag);
    }

//    checking
    public void doKitchenWork() {
        addWater();
        loadDishwasher();
        pourMilk();
    }
}



