public class StringMethods {
    public static void main(String[] args) {
        String birthDate="25/11/1982";
        int startingIndex=birthDate.indexOf("1982");
        System.out.println(" Starting Index ="+startingIndex);
        System.out.println(" Birth year ="+birthDate.substring(startingIndex));
        System.out.println("month ="+birthDate.substring(3,5));

        String newDate=String.join("/","20","11","1994");
        System.out.println(newDate);

        newDate="20";
        newDate=newDate.concat("/");
        newDate=newDate.concat("11");
        newDate=newDate.concat("/");
        newDate=newDate.concat("1994");
        System.out.println(newDate);

        newDate="25".concat("//").concat("11").concat("//").concat("1982");
        System.out.println(newDate);

        System.out.println(newDate.replace('/','-'));
        System.out.println(newDate.replace("2","00"));

        System.out.println(newDate.replaceFirst("/","--"));
        System.out.println(newDate.replaceAll("/","--"));

        System.out.println("Abc\n".repeat(4));
        System.out.println("-".repeat(20));

        System.out.println("Abc\n".repeat(4).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("  Abc\n".repeat(4).indent(-2));
        System.out.println("-".repeat(20));
    }
}
