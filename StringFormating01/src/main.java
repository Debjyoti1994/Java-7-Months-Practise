public class main {
    public static void main(String[] args) {
        String bulletIt="Print a bulleted List\n"+
                "\t\u2022 First Point\n"+
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);
        String textblock= """
                Print a bulleted List:
                   \u2022 First Point
                      \u2022 Sub Point""";
        System.out.println(textblock);
        System.out.printf("Your age is %d.%n",35);
        System.out.printf("Your age is %d,So u must be born on %d.%n",35,1972);
        System.out.printf("Your age is %.2f%n",(float)35);
        for (int i=1;i<=1000;i*=10){
            System.out.printf("Printng the number: %4d%n",i);
        }
        String formatedString=String.format("Your age is %d",35);
        System.out.println(formatedString);
        formatedString="your age is %d".formatted(68);
        System.out.println(formatedString);



    }



}
