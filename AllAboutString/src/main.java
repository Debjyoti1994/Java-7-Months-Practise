public class main {
    public static void main(String[] args) {
        Print("Hardwork");
        Print("");
        Print("\t \n");
        String helloWorld="Hello World";
        System.out.printf("Index of r =%d%n",helloWorld.indexOf('r'));
        System.out.printf("Index of World =%d%n",helloWorld.indexOf("World"));

        System.out.printf("Index of l =%d%n",helloWorld.indexOf('l'));
        System.out.printf("LastIndex of l =%d%n",helloWorld.lastIndexOf('l'));

        System.out.printf("Index of l =%d%n",helloWorld.indexOf('l',3));
        System.out.printf("LastIndex of l =%d%n",helloWorld.lastIndexOf('l',8));
        String helloWorldLower=helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)){
            System.out.println("Strings are equal");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("values match ignoring case");
        }
        if (helloWorld.startsWith("Hello")){
            System.out.println("It starts with Hello");
        }
        if (helloWorld.endsWith("World")){
            System.out.println("It starts with World");
        }
        if (helloWorld.contains("Hello")){
            System.out.println("It contains Hello");
        }
        if (helloWorld.contentEquals("Hello")){
            System.out.println("It contains Hello");
        }

    }
    public static void Print(String string){
        int d=string.length();
        System.out.printf("length of the string is %d%n",d);
        if (string.isEmpty()){
            System.out.println("String is empty");
            return;
        }
        if (string.isBlank()){
            System.out.println("String is blank");
        }
        System.out.printf("Char at the start is %c%n",string.charAt(0));
        System.out.printf("Char at ending is %c%n",string.charAt(string.length()-1));
    }
}
