public class main {
    public static void main(String[] args) {
        String helloWorld="Hello"+" World";
        helloWorld.concat(" and Good Bye");
        StringBuilder helloWorldBuilder=new StringBuilder("Hello"+" World");
        helloWorldBuilder.append(" and Good Bye");
        printInformation(helloWorld);
        printInformation(helloWorldBuilder);


        StringBuilder emptyStart=new StringBuilder();
        emptyStart.append("a".repeat(57));
        StringBuilder emptyStart32=new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);


        StringBuilder builderPlus=new StringBuilder("Hello"+" World");
        builderPlus.append(" and Good Bye");

//        System.out.println(builderPlus.indexOf("G"));
        builderPlus.deleteCharAt(16).insert(16,'g');
        builderPlus.replace(16,17,"G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(8);
        System.out.println(builderPlus);


    }
    public static  void printInformation(String string){
        System.out.println("String ="+string);
        System.out.println("Length ="+string.length());
    }
    public static  void printInformation(StringBuilder builder){
        System.out.println("Stringbuilder ="+builder);
        System.out.println("Length ="+builder.length());
        System.out.println("Capacity ="+builder.capacity());
    }
}
