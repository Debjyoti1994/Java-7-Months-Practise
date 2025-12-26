public class Worker {
    protected String name;
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        int DOB=Integer.parseInt(birthDate);
        int currentYear=2025;
//        System.out.println("The age of the worker is "+(2025-(DOB)));
        return (2025-DOB);
    }
    public Worker(){

    }
    public double collectPay(){
        return 0;
    }
    public void terminate(String endDate){
        this.endDate=endDate;
    int terminateDate=Integer.parseInt(endDate);

    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
