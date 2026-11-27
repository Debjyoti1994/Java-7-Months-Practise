package dev.Lpa;

public interface Mappable {
     void render();
     static double[] stringToLatLon(String location) {
          //for loop not redundant as only to elements in the String array
          var splits = location.split(",");
          double lat=Double.parseDouble(splits[0]);
          double lng=Double.parseDouble(splits[1]);
          return new double[]{lat,lng};

//          double[] googleLocation = new double[myarray.length];
//          for (int i = 0; i < splits.length; i++) {
//               googleLocation[i] = Double.parseDouble(splits[i].trim());
//
//          }
//          return googleLocation;
     }


}
