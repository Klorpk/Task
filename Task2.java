package org.example;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args){

        var scn = new Scanner(System.in);
        System.out.println("Введете коофициенты 1 уравнения прямой a1,b1,c1");
        double a1 = scn.nextInt();
        double b1 = scn.nextInt();
        double c1 = scn.nextInt();

        System.out.println("Введете коофициенты 2 уравнения прямой a2,b2,c2");
        double a2 = scn.nextInt();
        double b2 = scn.nextInt();
        double c2 = scn.nextInt();

        if (a1==a2 ) {
            if (b1==b2){
                if (c1==c2){
                    System.out.println("Прямые совподают");
                }
                else {
                    System.out.println("Прямые парралельны");
                }
            }
            else {
                double y =(c1*a2 -c2*a1)/(-b1*a2 + b2*a1);
                double x = (-c1-b1*y)/a1;
                System.out.println("Прямые пересекаются");
                System.out.printf("Точка пересечения (%f;%f)\n",x,y);
            }
        }
        else {
            var y =(c1*a2 -c2*a1)/(-b1*a2 + b2*a1);
            var x = (-c1-b1*y)/a1;
            System.out.println("Прямые пересекаются");
            System.out.printf("Точка пересечения (%f;%f)\n",x,y);
        }

    }
}
