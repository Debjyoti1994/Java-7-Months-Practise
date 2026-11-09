package dev.Lpa;

import java.util.ArrayList;
import java.util.List;

public class Layer <T extends Mappable>{
    private List<T>mappable=new ArrayList<>();

    public Layer() {
        mappable = mappable;
    }

    public void addElements(T t){
        mappable.add(t);


    }
    public void renderLayer(){
        for (T element:mappable){
            System.out.println(element.render());
        }
    }

    @Override
    public String toString() {
        return ""+mappable;
    }
}
