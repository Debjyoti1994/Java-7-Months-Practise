public class main {
    public static void main(String[] args) {
    Monitor theMonitor=new Monitor("27 inch Beast","Acer"
    ,27,"2540 X 1440");
    ComputerCase theComputerCase=new ComputerCase("2208","Dell"
    ,"240");
    Motherboard theMotherboard=new Motherboard("BJ-200","Asus",4,6,"2.44");
    PersonalComputer thePersonalComputer=new PersonalComputer("2208","Dell"
    ,theMonitor,theComputerCase,theMotherboard);

//    thePersonalComputer.getMonitor().drawPixel(7,8,"red");
//    thePersonalComputer.getComputerCase().pressPowerButton();
//    thePersonalComputer.getMotherboard().loadProgram("Mary");
        thePersonalComputer.powerUp();


    }
}
