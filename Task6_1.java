// Задача № 5
package org.example;

import static java.lang.Math.abs;
import java.util.Scanner;

public class Task6_1 {

    public static double term(int n, double x) {
        if (n == 0) return 1 * Math.pow(x, 0);
        return (-1) * term(n - 1, x) * (n + 1) * x / n;
    }

    public static double sum(int N, double x) {
        if (N == 0) return 0;
        return term(N - 1, x) + sum(N - 1, x);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double x = 1;

        System.out.println("Введите N ");
        int N = scn.nextInt();
        System.out.println("Введите e ");
        double e = scn.nextDouble();

        double sumE=0;
        double sumE10=0;

        for (int i=0;i<N;i++){

            if (abs(term(i,x))>e){
                sumE+= term(i,x);
            }
            if (abs(term(i,x)) > e/10) {
                sumE10 += term(i,x);
            }
        }
        System.out.println("Сумма n слг = " + sum(N,x));
        System.out.println("Сумма |n слг| > e = " + sumE);
        System.out.println("Сумма |n слг| > e/10 = " + sumE10);
    }
}
