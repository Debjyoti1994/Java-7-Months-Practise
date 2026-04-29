public class main {
    public static void main(String[] args) {
        SmartKitchen smartKitchen=new SmartKitchen();
//
//        smartKitchen.getBrewmaster().setHasWorkToDo(true);
//        smartKitchen.getIcebox().setHasWorkToDo(true);
//        smartKitchen.getDishWasher().setHasWorkToDo(true);
//        smartKitchen.getBrewmaster().brewCoffee();
//        smartKitchen.getDishWasher().doDishes();
//        smartKitchen.getIcebox().orderFood();
        smartKitchen.setKitchenState(true,false,true);
        smartKitchen.doKitchhenWork();
    }
}
