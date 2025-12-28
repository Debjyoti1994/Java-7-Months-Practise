public class Main {
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\t  \n");
        String helloWorld="Hello World";
        System.out.printf("index of r=%d%n",helloWorld.indexOf('r'));
        System.out.printf("index of world=%d%n",helloWorld.indexOf("World"));

        System.out.printf("index of l=%d%n",helloWorld.indexOf('l'));
        System.out.printf("last index of l=%d%n",helloWorld.lastIndexOf('l'));
        System.out.printf("index of l=%d%n",helloWorld.indexOf('l',3));
        System.out.printf("last index of l=%d%n",helloWorld.lastIndexOf('l',3));
        String helloWorldLower=helloWorld.toLowerCase();
        if(helloWorldLower.equals(helloWorld)){
            System.out.println("Both Strings are equal");
        }
        if(helloWorldLower.equalsIgnoreCase(helloWorld)){
            System.out.println("Both Strings are not equal");
        }
        if (helloWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");}
        if (helloWorld.endsWith("World")){
            System.out.println("String ends with World");}
        if (helloWorld.contains("World")){
            System.out.println("contains World");}
        if(helloWorld.contentEquals("Hello World")){
            System.out.println("Both Strings are equal");
        }


    }
    public static void printInformation(String string) {
        int length=string.length();
        System.out.printf("Length= %d%n",length);
        if (string.isEmpty()){
            System.out.println("String is Empty");
            return;
        }
        if (string.isBlank()){
            System.out.println("String is blank");
        }
        System.out.printf("First char= %c%n",string.charAt(0));


        System.out.printf("Last char= %c%n",string.charAt(length-1));
    }
}
