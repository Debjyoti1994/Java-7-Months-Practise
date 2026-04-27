public class main {
    public static void main(String[] args) {
    Employee tim=new Employee("tim","20/11/1994","20/11/2016");
        System.out.println(tim);
        System.out.println(" Age=>>"+tim.getAge());
        System.out.println(" Pay=>>"+tim.collectPay());
        SalariedEmployee joe=new SalariedEmployee("joe","20/11/1986","20/11/2020",50_000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck is =$"+joe.collectPay());
        joe.retire();
        System.out.println("Joe's Pension is =$"+joe.collectPay());
        HourlyEmployee mary=new HourlyEmployee("mary","20/11/2002","20/1/2026",90);
        System.out.println("Mary salary is $"+mary.collectPay());
        System.out.println("Mary salary  during holiday is $"+mary.getDoublepay());




    }
}
