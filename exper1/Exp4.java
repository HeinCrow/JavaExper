package com.expriment;

public class Exp4 {
    static void main() {
        double i = 2, j = 1;
        double sum = 0;
        for (j = 1; j <= 30; j++,i++) {
            sum += i/(2*j);
        }
        System.out.println(sum);
    }
}
