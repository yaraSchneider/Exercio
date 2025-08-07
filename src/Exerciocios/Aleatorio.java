package Exerciocios;

/*
    Faça um algoritmo que gere a seguinte série: 10, 20, 30, 40, ... 980, 990, 1000.
 */

public class Aleatorio {
    public static void main(String[] args) {

        int numero = 10;

        while (numero <= 1000) {
            System.out.println(numero);
            numero += 10; // Soma de 10 em 10
        }
    }
}
