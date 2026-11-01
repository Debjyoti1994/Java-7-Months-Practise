package dev.Lpa;

public class Main {
    public static void main(String[] args) {
        label mylabel=new label("White house","Govt Building");
//        System.out.printf(mylabel.toString());
         Building mybuilding=new Building(new label("Post Office","Govt Services"),new iconType("green star"));
         mybuilding.returnLabel();
         mybuilding.toJSON();
         UtiltyLine myutilty=new UtiltyLine(new label("College St","FIBER_OPTIC"),new iconType("GREEN DOTTED"));
         myutilty.toJSON();

    }
}
