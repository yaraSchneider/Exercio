package Exerciocios;

/*
    Ler uma variável de número inteiro e mostrar a tabuada desse número. Usando o laço de
    repetição Do While.

 */

import java.util.Scanner;

public class Tabuada1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int cont = 0;

        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        do {
            cont++;
            System.out.println(num * cont);
        } while (cont != 10);

    }
}
