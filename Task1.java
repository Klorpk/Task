package org.example;

import java.util.Scanner;

public class Task1 {
    public static double square(double r){
        return ((2*r)*(2*r)-(r*r*3.14))/2;
    }
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var r=scn.nextFloat();
        var s = square(r);
        System.out.printf("Площадь фигуры = %.2f см^2\n",s);

    }

}
