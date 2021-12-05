package com.company.Multitool;

public class Screwdriver extends Tool{
    String message = "Screw\n";

    public Screwdriver(Tool multitool) {
        this.message = multitool.getSound() + message;
    }

    public Screwdriver() {

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
