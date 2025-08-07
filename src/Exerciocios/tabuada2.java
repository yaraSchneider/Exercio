package Exerciocios;

import java.util.Scanner;

/*
    Ler uma variável de número inteiro e mostrar a tabuada desse número. Usando o laço de
    repetição While.
 */
public class tabuada2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int cont = 0;

        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        while (cont != 10) {
            cont++;
            System.out.println(num * cont);
        }

    }
}
