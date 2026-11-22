package dev.Lpa;

import java.util.ArrayList;
import java.util.List;

public class Park extends Point{
    private String name;
    private List<Double>GoggleLocaion;

    public Park(String name, List<Double> goggleLocaion) {
        this.name = name;
        GoggleLocaion = new ArrayList<>(goggleLocaion);
    }
}
