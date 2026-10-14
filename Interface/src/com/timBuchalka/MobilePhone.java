package com.timBuchalka;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn=false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn=true;
        System.out.println("MobilePhone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
        System.out.println("Now ringing"+phoneNumber+" on mobile Phone");
    }else {
            System.out.println("Phone is switched off");
        }}

    @Override
    public void answer() {

        if(isRinging){
            System.out.println("Answer the mobile Phone");
//            isRinging=false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber && isOn){
            isRinging=true;
            System.out.println("Melody ringng");
        }else {
            isRinging=false;
            System.out.println("MObile phone not turned on");
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

