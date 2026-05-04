public class SideItem extends Meal{
    private String type;
    private double price;

    public SideItem() {
    }

    public SideItem(String type) {
        this.type = type;
        switch (type.toUpperCase().charAt(0)){
            case 'F'->this.price=100;
            case 'S'->this.price=2;
            default -> this.price=50;
        }
    }
    public void PrintSideItem(){
        StringBuilder sidedrink=new StringBuilder();
        sidedrink.append("\nType of Side Drink ="+type);
        sidedrink.append("\nPrice of Side Drink="+price);
        System.out.println(sidedrink);
        System.out.printf("--".repeat(30));
    }
}
