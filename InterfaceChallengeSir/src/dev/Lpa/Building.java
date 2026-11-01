package dev.Lpa;
enum UsageType{BUSINESS,ENTERTAINMENT,GOVERNMENT,RESIDENTIAL,SPORTS}

public class Building implements Mappable{
    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name+" ("+usage + ") ";
    }
    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON()+ """
           , "name": "%s", "usage":"%s" """.formatted(name,usage);
    }

    @Override
    public String getMarker() {
        return switch (usage){
            case ENTERTAINMENT -> COLOR.GREEN+" "+PointMarker.TRIANGLE;
            case GOVERNMENT -> COLOR.RED+" "+PointMarker.STAR;
            case RESIDENTIAL -> COLOR.BLUE+" "+PointMarker.SQUARE;

            case SPORTS ->COLOR.ORANGE+" "+PointMarker.PUSH_PIN;
            default -> COLOR.BLACK+" "+PointMarker.CIRCLE;
        };

    }
}
