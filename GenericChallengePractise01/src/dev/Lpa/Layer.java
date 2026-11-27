package dev.Lpa;

import javax.lang.model.util.Elements;
import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable>{
    private List<T>layerElements=new ArrayList<>();

    public Layer() {
    }

    public Layer(List<T> layerElements) {
        this.layerElements = layerElements;
    }
    public void addElements(T Element){
        layerElements.add(Element);
    }
    public void renderLayer(){
        for(var e:layerElements){
            e.render();
        }
    }
}
