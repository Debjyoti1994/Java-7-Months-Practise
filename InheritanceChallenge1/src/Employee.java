public class Employee extends Worker{
    private long employeeId;
    protected String hireDate;

    public Employee(String name, String dateOfBirth, String endDate, long employeeId, String hireDate) {
        super(name, dateOfBirth, endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }
    public Employee(){

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
