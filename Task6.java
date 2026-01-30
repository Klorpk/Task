package org.example;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task6 {


    public static void Summa(double n, double x, double e){
        double SummaN=0;
        double SummaAbs=0;
        double SummaAds10=0;

        for (double i=0; i < n ; i++ ){

            double a1 = ((i+1)* pow((-x),i));
            SummaN+=a1;
            if (abs(a1) > e){
                SummaAbs+=a1;
            }
            if (abs(a1) > (e/10)){
                SummaAds10+=a1;
            }

        }
        System.out.printf(" Сумма n слг = %.2s, \n  Сумма |n слг| > e = %.2s \n , Сумма |n слг|> e/10 = %.2s",SummaN,SummaAbs,SummaAds10);
    }

    public static void main(String[] arg) {
        var scn = new Scanner(System.in);
        double x=1;
        System.out.println("Введите n ");
        double n=scn.nextDouble();
        System.out.println("Введите e ");
        double e=scn.nextDouble();
        Summa(n,x,e);

    }

}
