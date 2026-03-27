package Exercicios;

import java.util.Scanner;

public class Bee2344_NotasDaProva {
    static Scanner l = new Scanner(System.in);
    public static void main(String[] args) {
        int nota = l.nextInt();
        if(nota == 0) {
            System.out.println("E");
        } else if(nota < 36) {
            System.out.println("D");
        } else if(nota < 61) {
            System.out.println("C");
        } else if(nota < 86) {
            System.out.println("B ");
        } else {
            System.out.println("A");
        }
    }
}
