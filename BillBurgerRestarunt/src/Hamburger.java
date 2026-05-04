public class Hamburger extends Meal {
    private String burgerType;
    private double basePrice;
    private String topping;
    protected boolean delux=false;
    StringBuilder topping1=new StringBuilder("");

    public Hamburger() {
    }

    public Hamburger(String burgerType, double basePrice) {
        this.burgerType = burgerType;
        switch (burgerType.toUpperCase().charAt(0)) {
            case 'V' -> this.basePrice = 70.00;
            case 'S' -> this.basePrice = 90.00;
            case 'D' -> this.basePrice = 200.00;
            case 'T' -> this.basePrice = 150.00;
            case 'I' -> this.basePrice = 900.00;

            default -> this.basePrice = basePrice;
        }


    }

    public String BurgerTopping(String name) {
        switch (name.toUpperCase().charAt(0)) {
            case 'C' -> {
                basePrice += 50;
                return "Cheese";
            }
            case 'V' -> {
                basePrice += 100;
                return "Vegetable";
            }
            case 'P' -> {
                basePrice += 100;
                return "Paneer";
            }
            case 'M' -> {
                basePrice += 120;
                return "Mozilla Chesses";
            }
            default -> {
                return "Empty";
            }}

    }

    public void AddTopping(String topping01,String topping02,String topping03){
        topping1.append("topping 1:->"+BurgerTopping(topping01));
        topping1.append("\ntopping 2:->"+BurgerTopping(topping02));
        topping1.append("\ntopping 3:->" +BurgerTopping(topping03)+"\n");
    }
    public void Deluxe(boolean delexux,String toppingDelux1,String toppingDeluxe2){
        this.delux=delexux;
        if (delexux){
            topping1.append("Additional topping 1: "+BurgerTopping(toppingDelux1)+"\n");
            topping1.append("Additional topping 2: "+BurgerTopping(toppingDeluxe2));
            basePrice=500;
            System.out.println("Deluxe opton is on");

        }
    }


    public void setBurgerType(String burgerType) {
        this.burgerType = burgerType;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setTopping1(StringBuilder topping1) {
        this.topping1 = topping1;
    }

    public void  hamburgerPrint(){
            System.out.println("\nBurger type :-"+ burgerType);
            System.out.println(topping1);
            System.out.println("Total cost:->"+basePrice);
        System.out.printf("--".repeat(30));


        }
}
