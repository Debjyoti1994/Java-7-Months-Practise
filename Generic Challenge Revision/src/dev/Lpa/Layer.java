package dev.Lpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Layer<T extends Mappable> {
    private  List<T> mapped = new ArrayList<>();

    public void addMembers(T t) {
        mapped.add(t);
    }

    public Layer() {
    }

    public void renderLayer() {
//        for (var mykey:mapped){
//        if (mykey instanceof Park park) {
//            park.render();
//        }
//        if (mykey instanceof River river) {
//            river.render();
//        }
//
//    }
        for (T element:mapped){
            element.render();
        }

}}
