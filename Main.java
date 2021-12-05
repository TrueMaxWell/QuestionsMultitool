package com.company.Multitool;

public class Main {
    public static void main(String[] args) {
        Tool tool = new Knife(new NailPuller(new Screwdriver()));
        tool.work();


    }
}
