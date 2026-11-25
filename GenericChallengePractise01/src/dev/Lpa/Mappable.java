package dev.Lpa;

public interface Mappable {
     void render();
     static double[] stringToLatLon(String text1) {
          String[] myarray = text1.split(",");
          double[] googleLocation = new double[myarray.length];
          for (int i = 0; i < myarray.length; i++) {
               googleLocation[i] = Double.parseDouble(myarray[i]);

          }
          return googleLocation;
     }


}
