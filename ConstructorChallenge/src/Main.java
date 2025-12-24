public class Main {
    public static void main(String[] args) {

        Customer customer=new Customer("Debjyoti",2000,"199debjyotiroy20@gmai.com");
        System.out.println(customer.getName());
        System.out.println(customer.getEmailAddress());
        System.out.println(customer.getCreditLimit());

        Customer secondCustomer=new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getEmailAddress());
        System.out.println(secondCustomer.getCreditLimit());
        Customer thirdCustomer=new Customer("joe","joe@mai.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getEmailAddress());
        System.out.println(thirdCustomer.getCreditLimit());
    }
}
