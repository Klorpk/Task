package org.example;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Round {
    public double x0;
    public double y0;
    public double r;

    public Round(double x0, double y0, double r){
        this.x0=x0;
        this.y0=y0;
        this.r=r;
    }
    public boolean isPointInRound(double x, double y){ return y> sqrt(pow(r,2)-pow(x-x0,2) );}
}
