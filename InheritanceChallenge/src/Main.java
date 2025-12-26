public class Main {
    public static void main(String[] args) {
//        Worker ramesh=new Worker("Ramesh","1965","2024");
//        System.out.println(ramesh);
////        ramesh.getAge("1965");
//        SalariedEmployee Suresh=new SalariedEmployee("sures","1994","1978",
//                2000,"2000",2000,true);
//        System.out.println(Suresh);
//        Suresh.retire();
//        HourlyEmpoyee martin=new HourlyEmpoyee("martin","1978","2025",78667,"1979",
//                200);
//        martin.getDoublePay();
//        System.out.println(martin);

        //Code by lpa
        Employee tim=new Employee("Tim","1960","1994");
        System.out.println(tim);
        System.out.println("AGE ="+tim.getAge());
        System.out.println("PAY= "+tim.collectPay());

        SalariedEmployee joe=new SalariedEmployee("joe","1994","2016",56_000);
        System.out.println(joe);
        System.out.println("joe receives salary "+ joe.collectPay());
        joe.retire();
        System.out.println("JOE receives pension of " +joe.collectPay());
        HourlyEmpoyee Marie=new HourlyEmpoyee("Marie","1994","2010",40);
        System.out.println(Marie);
        System.out.println(" Marie receives salary of $"+Marie.collectPay());
        System.out.println(" Marie receives salary of $"+Marie.getDoublePay()+" on holiday.");

    }
}
