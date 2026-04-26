public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String dateOfBirth, long employeeId, String hireDate,
                          double hourlyPayRate) {
        super(name, dateOfBirth,"2026", employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }
    public void getDoublePay(){
        System.out.println("Total payment of employee"+name+"is "+(Integer.parseInt(endDate)-Integer.parseInt(hireDate))*
                8*hourlyPayRate);
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }
}
