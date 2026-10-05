import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Accounts accounts=new Accounts("Rahul",123445,6777);
        Accounts accounts1=new Accounts("Shyam",123447,6767);
        Accounts accounts2=new Accounts("Mukul",1234,90777);
        Accounts accounts3=new Accounts("Ramesh",1235,677);
        Accounts accounts4=new Accounts("Rashi",123449,6779);
        Accounts accounts5=new Accounts("Ratri",123566,67787);
        Accounts accounts6=new Accounts("Rahi",123555,6777);


        LinkedList<Accounts> link=new LinkedList<>();
        link.add(accounts);
        link.add(accounts1);
        link.add(accounts2);
        link.add(accounts3);
        link.add(accounts4);
        link.add(accounts5);
        link.add(accounts6);

        link.add(new Accounts("Ramesh",5789,789));
        link.add(new Accounts("Suresh",678,789));
        link.add(new Accounts("Shyam",908,789));
        link.add(new Accounts("Taylor",478,789));
        link.add(new Accounts("Samesh",778,789));
        link.sort(Comparator.comparingInt(Accounts::getAccountNO));

        for(Accounts acccount:link){
            System.out.println(acccount);
        }
        LinkedList<Dog>myDog=new LinkedList<>();
        myDog.add(new Dog("radda",23,900.0));
        myDog.add(new Dog("gadda",93,9900.0));
        myDog.add(new Dog("yadda",63,800.0));

        myDog.sort(Comparator.comparingInt(Dog::Rank));
        for(Dog dogg:myDog){
            System.out.println(dogg);
        }
        System.out.println("---".repeat(12));
        ListIterator<Dog>my=myDog.listIterator(1);
        while (my.hasNext()){
            System.out.println(my.next());
        }

    }

}
