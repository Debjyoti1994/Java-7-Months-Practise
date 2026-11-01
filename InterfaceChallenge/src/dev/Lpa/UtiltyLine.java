package dev.Lpa;

public class UtiltyLine implements Mappable {
    private label myLabel;
    private geometryType mygeometry;
    private iconType myicon;

    public UtiltyLine(label myLabel, iconType myicon) {
        this.myLabel = myLabel;
        this.mygeometry = new geometryType("Line");
        this.myicon = myicon;
    }



    @Override
    public label returnLabel() {

        String textblock= """
                "properties": { "name": "%s", "utlity": "%s"}""".formatted(myLabel.name(),myLabel.usage());
        System.out.println(textblock);

        return myLabel;
    }


    @Override
    public geometryType returnGeometryType() {
        return new geometryType("Line");
    }

    @Override
    public iconType returnIconType()
    {
        return myicon;
    }

    @Override
    public void toJSON() {
        String mytext= """
               "properties": {"type:"LINE", "label":"%s(%s)", "marker":"%s", "name":"%s", "utility":"%s"}""".
                formatted(myLabel.name(),myLabel.usage(),myicon.marker(),myLabel.name(),myLabel.usage());
        System.out.println(mytext);
    }
}
