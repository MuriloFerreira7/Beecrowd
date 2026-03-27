package Exercicios;

import java.util.Scanner;

public class Bee1143_QuadradeEAoCubo {
    static Scanner l = new Scanner(System.in);
    public static void main(String[] args) {
        int n = l.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d\n", i, i*i, i*i*i);
        }
    }
}
