package dev.Lpa;

public interface Mappable {
    public label mylabel = null;

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

}

}
