package Exerciocios;

/*
    Ler dois números (inicial e final). Escreva quantos número pares e quantos números impares
    encontram-se entre os dois números fornecidos pelo usuário.
 */

import java.util.Scanner;

public class Impar_Par {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;


        System.out.println("Digite o 1° valor: ");
        int valor1 = sc.nextInt();

        System.out.println("Digite o 2° valor: ");
        int valor2 = sc.nextInt();

        for (int i = valor1; i <= valor2; i++) {

            if (i % 2 == 0) {
                count1++;
            }else {
                count2++;
            }
        }

        System.out.println("Tem: " + count1 + (count1 < 1 ? " numero par": " numeros pares"));
        System.out.println("Tem: " + count2 + (count2 < 1 ? " numero impar": " numeros impares"));

    }

}
