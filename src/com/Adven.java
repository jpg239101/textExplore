package com;

/**
 * Created by jg101 on 10/17/16.
 */
public class Adven {
    public double health = 20.0;
    public String name = "";
    public int wepType = 0;

    public Adven(String n, int w){

        name = n;
        wepType = w;
    }

    public double getHealth() {
        return health;
    }
}
