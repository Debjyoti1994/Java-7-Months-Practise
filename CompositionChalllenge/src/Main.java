public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen=new SmartKitchen();
//        kitchen.pourMilk();
//        kitchen.addWater();
//        kitchen.getIcebox().setHasWorkToDo(true);
//        kitchen.getBrewmaster().setHasWorkToDo(true);
//        kitchen.getDishwasher().setHasWorkToDo(true);
//
//
//        kitchen.getDishwasher().doDishes();
//        kitchen.getBrewmaster().brewCoffee();
//        kitchen.getIcebox().orderFood();
//        kitchen.doKitchenWork(true,false,true);
        kitchen.kitchenState(false,true,true);
        kitchen.doKitchenWork();
    }
}
