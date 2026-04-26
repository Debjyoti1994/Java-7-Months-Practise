public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String dateOfBirth, long employeeId,
                            String hireDate, double annualSalary, boolean isRetired) {
        super(name, dateOfBirth,"2026", employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public double collectPay() {
        double pay=Integer.parseInt(endDate)-Integer.parseInt(hireDate);
        return pay*annualSalary;

    }

    public void retire() {
        System.out.println(name+" age is "+getAge());
        if (isRetired){
            collectPay();
            System.out.println(" the total pay of  employee"+name+" is ₹"+1.5*collectPay());


        }
        else {
            System.out.println(" the total pay of  employee"+name+" is ₹"+collectPay());

        }

    }
}
