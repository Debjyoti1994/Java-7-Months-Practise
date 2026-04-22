public class main {
    public static void main(String[] args) {
        House blueHouse=new House("blue");
        House anotherHouse=blueHouse;
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());

        anotherHouse.setColor("yellow");
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());
        System.out.println("---------------");
        House beigeHouse=new House("beige");
        anotherHouse=beigeHouse;
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());
        System.out.println(beigeHouse.getColor());

        new House("red");
        s

    }
}
