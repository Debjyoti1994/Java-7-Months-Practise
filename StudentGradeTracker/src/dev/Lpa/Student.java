package dev.Lpa;

import java.util.ArrayList;

public record Student(String name, ArrayList<Double>grades) {
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
