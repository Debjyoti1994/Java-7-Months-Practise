package dev.Lpa;

public record Places(String place,int distance) {
    @Override
    public String toString() {
        return "" +
                  place +
                ", is at distance of " + distance + "km from Sydney. ";
    }
}
