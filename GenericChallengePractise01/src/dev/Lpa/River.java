package dev.Lpa;

public class River extends Line{
    private String name;

    public River( String name,double[][] location) {
        super(location);
        this.name = name;
    }

    @Override
    public void render() {
        System.out.printf("RENDER %s Line as %s (%s)%n",name,"POINT",location());
    }
}
