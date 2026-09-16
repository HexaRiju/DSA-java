package Bitmanupulation;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if ((x & 1) != 0)
            System.out.println("This number is odd");
        else
            System.out.println("This number is even");
    }
}
