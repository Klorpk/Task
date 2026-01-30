// Задача № 5
package org.example;

public class Task4 {
    public static double summa_sin(double d, double sum){
        while (d < 2.1) {
            var sin = Math.sin(d);
            sum = sin + sum;
            d = d + 0.1;
        }
        return sum;
    }
    public static void main(String[] args){
        double d = 1;
        double sum=0;
        double summa=summa_sin(d,sum);
        System.out.printf("значение суммы синусов = %.2f\n",summa);

    }
}
