package com.company.Multitool;

public class Knife extends Tool {
    String message = "Cut\n";


    public Knife(Tool multitool) {
        message = multitool.getSound() + message;
    }

    public Knife() {

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
