package dev.Lpa;
enum UtilityType{ELECTRICAL,FIBER_OPTIC,GAS,WATER}

public class UtilityLine implements Mappable {
    private String name;
    private UtilityType type;

    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name+" ("+type + ") ";
    }

    @Override
    public String getMarker() {
        return switch (type){
            case ELECTRICAL -> COLOR.RED+" "+LineMarker.DASHED;
            case FIBER_OPTIC -> COLOR.GREEN+" "+LineMarker.DOTTED;
            case GAS ->COLOR.ORANGE+" "+LineMarker.SOLID;
            case WATER ->COLOR.BLUE+" "+LineMarker.SOLID;
            default -> COLOR.BLACK+" "+LineMarker.SOLID;
        };
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }
    @Override
    public String toJSON() {
        return Mappable.super.toJSON()+ """
           , "name": "%s", "utility":"%s" """.formatted(name,type);
    }
}
