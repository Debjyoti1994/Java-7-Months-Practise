package dev.Lpa;

public interface Mappable {


    public label returnLabel();
    public geometryType returnGeometryType();
    public iconType returnIconType();

    String JSON_PROPERTY= """
            "properties%s":""";
    default public void toJSON(){
        System.out.printf("type :"+returnGeometryType()+" label"+returnLabel()+" marker"+returnIconType());

    }
static void Map(Mappable mymap){
        mymap.toJSON();
//        if(mymap instanceof UtiltyLine myutility){
//            myutility.returnLabel();
////            String t2= """
////                    "properties" {"name":%s, "utility":%s""".formatted(myutility.r);
//        }else {
//    System.out.println(mymap.returnLabel());}
    mymap.returnLabel();
    System.out.println(mymap.returnGeometryType());
    System.out.println(mymap.returnIconType());


}

}
