public class HourlyEmpoyee extends Employee{
    private double hourlyPayRate;

    public HourlyEmpoyee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "HourlyEmpoyee{" +
                "hourlyPayRate=" + hourlyPayRate +
                ", hireDate='" + hireDate + '\'' +
                ", name='" + name + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
    @Override
    public double collectPay(){
        return 40*hourlyPayRate;
    }


    public int getDoublePay(){
        return (int)(collectPay()*2);
//        int totalWorkingDays=-Integer.parseInt(hireDate)+terminate(endDate);
//        System.out.println("The total amount that the empoyee will reciive is "+
//                (totalWorkingDays*hourlyPayRate*8));
    }
}
