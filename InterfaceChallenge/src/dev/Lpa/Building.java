package dev.Lpa;

public class Building implements Mappable{
    private label myLabel;
    private geometryType mygeometry;
    private iconType myicon;

    public Building(label myLabel, iconType myicon) {
        this.myLabel = myLabel;
        this.mygeometry = new geometryType("point");
        this.myicon = myicon;
    }

    @Override
    public label returnLabel() {

        String textblock= """
                "properties": { "name": "%s", "usage": "%s"}
                """.formatted(myLabel.name(),myLabel.usage());
        System.out.println(textblock);

        return myLabel;
    }


    @Override
    public geometryType returnGeometryType() {
        return new geometryType("point");
    }

    @Override
    public iconType returnIconType()
    {
        return myicon;
    }

    @Override
    public void toJSON() {
        String mytext= """
               "properties": {"type:"PONT", "label":"%s(%s)", "marker":"%s", "name":"%s", "usage":"%s"}
                
               """.formatted(myLabel.name(),myLabel.usage(),myicon.marker(),myLabel.name(),myLabel.usage());
        System.out.println(mytext);
    }
}
