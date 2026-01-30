// Задача № 5
package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        var scn = new Scanner(System.in);
        var n= scn.nextInt();
        Random random = new Random();
        int[] array = new int[n];
        for ( int i=0;i < n;i++) {
            array[i] = random.nextInt(-100,100);
        }
        int[] array1 = new int[n];
        for (int j=0;j<n;j++){
            if (j%2==0){
                if(array[j]<0) {
                    array1[j] = array[j];
                    System.out.println(j);
                    break;
                }
            }
        }
        Arrays.sort(array1);
        if(array1[0]>=0){
            System.out.println(-1);
        }
        System.out.println(Arrays.toString(array));

    }
}
