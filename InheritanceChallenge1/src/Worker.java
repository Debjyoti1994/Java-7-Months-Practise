public class Worker {
    protected String name;
    private String dateOfBirth;
    protected String endDate;

    public Worker(String name, String dateOfBirth, String endDate) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.endDate = endDate;
    }
    public Worker(){}
    public int getAge(){
        return 2026-Integer.parseInt(dateOfBirth);
    }
    public double collectPay(){
        return 0;
    }
    public void terminate(String endDate){

    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", EndDate='" + endDate + '\'' +
                '}';
    }
}
