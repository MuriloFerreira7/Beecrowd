package Exercicios;

import java.util.Scanner;

public class Bee2414_DesafioDoMaiorNumero {

    static Scanner l = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.MIN_VALUE;
        while (l.hasNext()) {
            n = Math.max(n, l.nextInt());
        }
        System.out.println(n);
    }
}
