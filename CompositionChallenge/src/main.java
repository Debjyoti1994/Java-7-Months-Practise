public class main {
    public static void main(String[] args) {
        Refigerator ref=new Refigerator(false);
        CoffeMaker cof=new CoffeMaker(false);
        DishWasher dssh=new DishWasher(false);
    SmartKitchen skitchen=new SmartKitchen(cof,dssh,ref);
    skitchen.addWater();
    skitchen.pourMilk();
    skitchen.loadDishWasher();
    skitchen.doKitchenWork();
    }
}
