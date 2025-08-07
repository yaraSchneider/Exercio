package Exerciocios;

/*
   Crie um algoritmo que leia três valores e verifique se eles podem ser os comprimentos dos lados
   de um triângulo, e se forem, verificar se é um triângulo equilátero, isósceles ou escaleno. Se
   eles não formarem um triângulo, escrever a mensagem "Não é um triângulo".
   Antes da elaboração do algoritmo, torna-se necessária a revisão de algumas propriedades e
   definições.
   Propriedade - O comprimento de cada lado de um triângulo é menor do que a soma dos
   comprimentos dos outros dois lados, fora desta condição as medidas não são consideradas de
   um triângulo.
   Definição 1 - Chama-se triângulo equilátero os que tem os comprimentos dos três lados iguais,
   Definição 2 - Chama-se triângulo isósceles ao triângulo que tem os comprimentos de dois lados
   iguais.
   Definição 3 - Chama-se triângulo escaleno ao triângulo que tem os comprimentos dos três lados
   diferentes.
  */

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double lado1, lado2, lado3;

        System.out.println("Informe a valor do primeiro lado: ");
        lado1 = sc.nextDouble();

        System.out.println("Informe a valor do segundo lado: ");
        lado2 = sc.nextDouble();

        System.out.println("Informe a valor do terceiro lado: ");
        lado3 = sc.nextDouble();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {

            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Chama-se triângulo equilátero os que tem os comprimentos dos três lados iguais");

            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Chama-se triângulo isósceles ao triângulo que tem os comprimentos de dois lados iguais.");

            } else {
                System.out.println("Chama-se triângulo escaleno ao triângulo que tem os comprimentos dos três lados diferentes.");

            }

        }else {
            System.out.println("Não é um triângulo");
        }

    }
}
