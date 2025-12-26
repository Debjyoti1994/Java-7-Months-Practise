public class Employee extends Worker {
        public static int employeeNo=1;
        protected String hireDate;

        private long employeeID;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeID = Employee.employeeNo++;
        this.hireDate = hireDate;
    }
    public Employee(){

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", hireDate='" + hireDate + '\'' +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}
