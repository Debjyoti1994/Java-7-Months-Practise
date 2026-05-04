public class Main {
    public static void main(String[] args) {
//        Hamburger burger=new Hamburger("vegan",900);
//        burger.AddTopping("Cheese","Cheese","Cheese");
//        burger.Deluxe(true,"Vege","Pan");
//        burger.hamburgerPrint();

//        Drink typ=new Drink("large","small");
//        typ.PrintDrink();
        Meal defaltCombo=new Meal(new Drink(),new Hamburger(),new SideItem());
        defaltCombo.getHamburger().AddTopping("Cheese","Vegetable","Paneer");
        defaltCombo.getHamburger().Deluxe(true,"Cheese","Cheese");
        defaltCombo.PrintMeal();

    }
}
