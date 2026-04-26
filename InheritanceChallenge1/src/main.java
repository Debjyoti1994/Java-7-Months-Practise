public class main {
    public static void main(String[] args) {
        SalariedEmployee rakesh=new SalariedEmployee("Rakesh","1994",878899,"2016",
                770,true);
        System.out.println(rakesh);
        SalariedEmployee(rakesh);
        HourlyEmployee suresh=new HourlyEmployee("Suresh","1920",8907,"1989",
                4);
        System.out.println(suresh);


    }
    private static void SalariedEmployee(SalariedEmployee employee){
        employee.getAge();
        employee.collectPay();
        employee.retire();

    }
    private static void HourlyEmployee(HourlyEmployee hourlyEmployee){
        hourlyEmployee.collectPay();
        hourlyEmployee.getDoublePay();

    }
}
