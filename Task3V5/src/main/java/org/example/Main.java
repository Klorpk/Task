// Задача № 5
package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static final Line L1= new Line(-2,-2,4);
    public static final Round R1= new Round(-2,3,2);
    public static final Rectangle P1 = new Rectangle(-3,7,0,8);

    public static SimpleColor getColor(double x, double y) {

        if (P1.isPointInRectangle(x,y) && !L1.isPointAboveLine(x,y) && R1.isPointInRound(x,y)){
            return SimpleColor.BLUE;
        }
        if (P1.isPointInRectangle(x,y) && !L1.isPointAboveLine(x,y) && !R1.isPointInRound(x,y)){
            return SimpleColor.ORANGE;
        }
        if (P1.isPointInRectangle(x,y) && L1.isPointAboveLine(x,y) && !R1.isPointInRound(x,y) && y<2){
            return SimpleColor.ORANGE;
        }
        if (P1.isPointInRectangle(x,y) && L1.isPointAboveLine(x,y) && !R1.isPointInRound(x,y) && y>=2){
            return SimpleColor.GREEN;
        }
        if (P1.isPointInRectangle(x,y) && L1.isPointAboveLine(x,y) && R1.isPointInRound(x,y)){
            return SimpleColor.GREEN;
        }
        if(!L1.isPointAboveLine(x,y) && !P1.isPointInRectangle(x,y)){
            return SimpleColor.BLUE;
        }


        return SimpleColor.WHITE;
    }
    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.3f, %.3f) -> %s%n", x, y, getColor(x, y));
    }

    public static void tests() {
        printColorForPoint(-0.5, 2);
        printColorForPoint(-2, 0.5);
        printColorForPoint(-2, 3);
        printColorForPoint(-2, 6);
        printColorForPoint(1, 1);
        printColorForPoint(-1, -6);
        printColorForPoint(-7, 2);
    }

    public static void main (String[] args) {
        Locale.setDefault(Locale.ROOT);

        tests();

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите x, y: ");
        double x = scn.nextDouble();
        double y = scn.nextDouble();

        printColorForPoint(x,y);

    }


}
