package Exerciocios;

import java.util.Scanner;

/*
    Ler para uma variável INTEIRA um número de 1 a 12 e mostrar o nome do mês
    correspondente. Caso o mês não existir, mostrar essa informação: Esse mês não existe.
 */
public class Mes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um número para o mês escolhido: ");
        num = sc.nextInt();

       switch (num) {
           case 1:
               System.out.println("Janeiro");
           break;
           case 2:
               System.out.println("Fevereiro");
           break;
           case 3:
               System.out.println("Março");
           break;
           case 4:
               System.out.println("Abril");
           break;
           case 5:
               System.out.println("Maio");
           break;
           case 6:
              System.out.println("Junho");
           break;
           case 7:
               System.out.println("Julho");
           break;
           case 8:
               System.out.println("Agosto");
           break;
           case 9:
               System.out.println("Setembro");
           break;
           case 10:
               System.out.println("Outubro");
           break;
           case 11:
                System.out.println("Novembro");
           break;
           case 12:
               System.out.println("Dezembro");
           break;
           default:
               System.out.println("Esse mês não existe.");
           break;
       }
    }
}
