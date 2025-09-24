package com.expriment;

public class Exp3 {
    static void main() {
        int sum = 1;
        for (int i = 2; i < 10000; i++) {
            sum = 1;
            for (int j = 2; j < i-2; j++) {
                if (i%j == 0) {
                    sum += j;
                    if (sum > i){
                        break;
                    }
                }
            }
            if(sum == i) {
                System.out.println(i);
            }
        }
    }
}
