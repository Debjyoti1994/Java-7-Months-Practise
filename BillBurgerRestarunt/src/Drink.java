public class Drink extends Meal {
    private String type;
    private String size;
    private double price;

    public Drink() {
    }

    public Drink( String size, String type) {

        this.size = size;
        this.type = type;

        switch (type.toUpperCase().charAt(0)){
            case 'S'->this.price+=100;
            case 'R'->this.price+=50;
            case 'F'->this.price+=190;
            default -> this.price+=150;
        }

        switch (size.toUpperCase().charAt(0)){
            case 'L'->this.price+=100;
            case 'S'->this.price+=50;
            case 'D'->this.price+=190;
            default -> this.price+=150;
        }
    }
    public void PrintDrink(){
        StringBuilder drink=new StringBuilder(" ");
        drink.append("Type->"+type+"\n");
        drink.append("Size->"+size+"\n");

        drink.append("Price->"+price+"\n");
        System.out.println(drink);
        System.out.printf("--".repeat(30));

    }
}
