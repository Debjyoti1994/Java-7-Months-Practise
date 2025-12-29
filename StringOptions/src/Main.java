public class Main {
    public static void main(String[] args) {
    String helloWorld="Hello"+" World";
    helloWorld.concat(" and Goodbye");
    StringBuilder helloWorldBuilder= new StringBuilder("Hello" + " World");
    helloWorldBuilder.append(" and Goodbye");

    printInformation(helloWorld);
    printInformation(helloWorldBuilder);

    StringBuilder emptyStart=new StringBuilder();
    emptyStart.append("a".repeat(57));
    StringBuilder emptyStart32=new StringBuilder(32);
    emptyStart32.append("a".repeat(17));




    printInformation(emptyStart);
    printInformation(emptyStart32);


        StringBuilder builderplus= new StringBuilder("Hello" + " World");
        builderplus.append(" and Goodbye");
        builderplus.deleteCharAt(16).insert(16,'g');
        System.out.println(builderplus);

        builderplus.replace(16,17,"G");
        System.out.println(builderplus);

        builderplus.reverse().setLength(7);
        System.out.println(builderplus);


    }
    public static void printInformation(String string){
        System.out.println("String = "+string);
        System.out.println("length = "+string.length());

    }
    public static void printInformation(StringBuilder builder){
        System.out.println("StringBuilder = "+builder);
        System.out.println("length = "+builder.length());
        System.out.println("capacity = "+builder.capacity());
        System.out.println("______");

    }
}
