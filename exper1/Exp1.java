package com.expriment;

import java.util.Arrays;

/**
 * @author fengmei
 */
public class Exp1 {
    static void main() {
        double[] a = new double[100];
        int i;
        for (i = 0; i < 100; i++) {
            a[i] = 100 + Math.random()*900;
        }
        Arrays.sort(a);
        double sum = 0;
        for (i = 99; i >= 90; i--) {
            System.out.println(a[i]+" ");
            sum += a[i];
        }
        System.out.println(sum);
    }
}
