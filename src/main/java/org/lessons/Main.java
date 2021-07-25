package org.lessons;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int n = s.nextInt();
        int f1 = 0;
        int f2 = 0;
        int oddCount = 0;
        int evenCount = 0;

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            if (a % 2 == 0) {
                f2 = a;
                evenCount++;
            } else {
                f1 = a;
                oddCount++;
            }
            System.out.print(a);
            System.out.print(" ");
            a = a + b;
            b = a - b;
        }
        System.out.println();
        System.out.println("Biggest odd number (F1): " + f1);
        System.out.println("Biggest even number (F2): " + f2);
        System.out.println();
        System.out.println("Percentage of odd: " + oddCount * 100 / n + "%");
        System.out.println("Percentage of even: " + evenCount * 100 / n + "%");
    }
}
