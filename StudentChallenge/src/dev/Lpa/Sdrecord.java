package dev.Lpa;

public record Sdrecord(String name,int rollNumber,double marks) {

    public boolean isPassing(){
        if (marks>40){
            System.out.println(name+" has passed");
            return true;
        }else {
            System.out.println(name+"has failed");
            return false;
        }
    }
}
