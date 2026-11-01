package dev.Lpa;

public record label (String name,String usage)  {
    @Override
    public String toString() {
        return "properties {" +
                "name='" + name + '\'' +
                ", usage='" + usage + '\'' +
                '}';
    }
}
