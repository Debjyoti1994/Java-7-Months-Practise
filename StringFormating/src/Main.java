import java.awt.*;

public class Main {
    public static void main(String[] args) {
    String bulletIt="Print a bulleted list:\n"+
            "\t\u2022 First point\n"+
            "\t\t\u2022 Sub point";
        System.out.println(bulletIt);

        String textBlock= """
                Print a bulleted list:
                           \u2022 First Point
                                \u2022 Sub Point""";
        System.out.println(textBlock);
        int age=35;
        System.out.printf(" Age is %d\n",age);
        int yearOfBirth=2023-age;
        System.out.printf("Age=%d,Birth Year=%d%n",age,yearOfBirth);
        System.out.printf("Your age is %.2f%n",(float)age);
        for (int i=1;i<=10000;i*=10){
            System.out.printf("Printing %6d%n",i);
        }
        String formattedString=String.format("Your age is %d%n",age);
        System.out.printf(formattedString);
        formattedString="Your age is %d".formatted(age);
        System.out.println(formattedString);


    }
}
