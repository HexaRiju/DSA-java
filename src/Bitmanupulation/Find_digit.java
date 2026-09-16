package Bitmanupulation;

import java.util.Scanner;

public class Find_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // given number
        int r = sc.nextInt(); // base

        if (n < 0) {
            n = -n;
        }
        if (r <= 1 || n == 0) {
            System.out.println(1);
            return;
        }

        int digits = 0;
        while (n > 0) {
            n /= r;
            digits++;
        }
        System.out.println(digits);
    }
}
