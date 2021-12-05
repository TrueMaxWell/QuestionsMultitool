package com.company.Multitool;

public class NailPuller extends Tool{
    String message = "Pulls nail\n";

    public NailPuller(Tool multitool) {
        this.message = multitool.getSound() + message;
    }

    public NailPuller() {

    }

    @Override
    public void work() {

        System.out.println(message);
    }

    @Override
    public String getSound() {
        return message;
    }
}
