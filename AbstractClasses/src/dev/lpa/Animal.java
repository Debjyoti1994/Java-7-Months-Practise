package dev.lpa;

public  abstract class   Animal {
     private String type;
     private String size;
     private Double weight;

    public Animal(String type, String size, Double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public  abstract void move(String speed);
    public abstract void makeNoise();

}
