package dev.Lpa;

import java.util.ArrayList;
import java.util.Arrays;

public class River extends Line {
    private String name;
    private String type;

    private ArrayList<ArrayList<Double>> googleLocation;


    public River(String name, String type, ArrayList<ArrayList<Double>> googleLocation) {
        this.name = name;
        this.googleLocation = googleLocation;
        this.type = type;
    }

    public River(String name) {
//        this(name,"River");
        this.name = name;
        googleLocation = new ArrayList<>();
    }

    public River(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void addlocation(double lat, double longi) {

        ArrayList<Double> g1 = new ArrayList<>();
        g1.add(lat);
        g1.add(longi);
        googleLocation.add(g1);

    }

    public ArrayList<ArrayList<Double>> getGoogleLocation() {
        return googleLocation;
    }



    @Override
    public String render() {
        return "RENDER " + name + " " + (type == null ? "River" : type) + " as Line (" + googleLocation + ")";
    }

    @Override
    public String toString() {
        return render() ;
    }
    public String printGoogleLcation(ArrayList<ArrayList<Double>> googleLocation) {
        StringBuilder myText=new StringBuilder();
        myText.append("(");
        boolean firstGroup=true;
        for (ArrayList<Double> myarray : googleLocation) {
            if (!firstGroup){
                myText.append(", ");//Add comma between pairs
            }
            myText.append("[");//Open bracket for latitude
            boolean firstVal =true;
            for (double myrow : myarray){
                if (!firstVal)
                {
                    myText.append(", ");//Comma between Latitude and LOngitude
                }

                myText.append(myrow);
                firstVal=false;
            }
            myText.append("]");
            firstGroup=false;

        }
        return myText.append(")").toString();
    }
}
