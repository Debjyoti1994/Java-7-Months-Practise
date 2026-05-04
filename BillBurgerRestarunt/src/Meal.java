public class Meal {
    private Drink drink;
    private Hamburger hamburger;
    private SideItem sideItem;
    public Meal(){}

    public Meal(Drink drink, Hamburger hamburger, SideItem sideItem) {
        this.drink = new Drink("small"," rasberry");
        this.hamburger = new Hamburger("vhv",89);
        this.sideItem = new SideItem("kj");
    }

    public Drink getDrink() {
        return drink;
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public SideItem getSideItem() {
        return sideItem;
    }

    public void PrintMeal(){
        getDrink().PrintDrink();
        getHamburger().hamburgerPrint();
        getSideItem().PrintSideItem();
        if( (getHamburger().delux)){
            System.out.println("\nGrand total: $ 500 \n");




        }
        System.out.printf("--".repeat(40));
        System.out.printf("\nThanks for shopping with us ..Enjoy your meal");

    }
}
