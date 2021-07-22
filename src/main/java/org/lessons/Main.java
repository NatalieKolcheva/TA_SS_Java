package org.lessons;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variables
        int sumOdd = 0;
        int sumEven = 0;
        int i;
        //input
        Scanner input = new Scanner(System.in);
        System.out.println("Input beginning of the interval:");
        int inputBegin = input.nextInt();
        System.out.println("Input ending of the interval:");
        int inputEnd = input.nextInt();
        //calculation
        i = inputBegin;
        while (i <= inputEnd) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            } else
                sumOdd = sumOdd + i;
            i++;
        }
        //out
        System.out.println("Result Even numbers:"+sumEven);
        System.out.println("Result Odd numbers:"+sumOdd);
    }
}
