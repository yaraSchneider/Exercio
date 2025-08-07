package Exerciocios;

import java.util.Scanner;

/*
    Ler uma variável de número inteiro e mostrar a tabuada desse número. Usando o laço de
    repetição For.

 */
public class Tabuada3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        for (int cont = 1; cont <= num; cont++) {
            System.out.println(num * cont);
        }

    }
}
