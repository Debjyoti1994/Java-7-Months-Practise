public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");
        System.out.println("Make = "+car.getMake());
        System.out.println("Model = "+car.getModel());
        car.describeCar();

        Car targa=new Car();
        targa.setMake("Porsche");
        targa.setModel("targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("red");
        targa.describeCar();


    }

}
