package Exerciocios;

import java.util.Scanner;

/*
    Ler 2 números, efetuar as 4 operações matemáticas e mostrar os resultados, ao final de cada
    operação informa se o resultado é PAR ou IMPAR.
 */
public class Contas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1° valor: ");
        int valor1 = sc.nextInt();

        System.out.println("Digite o 2° valor: ");
        int valor2 = sc.nextInt();

        double soma = 0;

        for (int i = 1; i <= 4; i++) {

            switch (i) {
                case 1:
                    soma = valor1 + valor2;
                break;
                case 2:
                    soma = valor1 - valor2;
                break;
                case 3:
                    soma = valor1 * valor2;
                break;
                case 4:
                    soma = valor1 / valor2;
                break;
            }

            if (i % 2 == 0) {
                System.out.println(soma + " é par");
            }else {
                System.out.println(soma + " é impar");
            }

        }
    }

}
