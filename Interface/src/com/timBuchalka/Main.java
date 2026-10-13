package com.timBuchalka;

public class Main {
    public static void main(String[] args) {
    ITelephone timPhone;
    timPhone=new DeskPhone(123456);
    timPhone.powerOn();
    timPhone.callPhone(123456);
    timPhone.answer();
        System.out.println("-".repeat(12));
    }
}
