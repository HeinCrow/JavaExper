package com.expriment;

import java.util.Scanner;

public class Exp2 {
    static void main() {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        double fee = 0;
        if (n < 51) {
            fee = n*0.4;
        } else if (n < 101) {
            fee = 50*0.4 + 0.6*(n-50);

        }else {
            fee = 50*0.4 + 0.6*50 + (n-100)*0.8;
        }
        System.out.println(fee);
        scanner.close();
    }
}
