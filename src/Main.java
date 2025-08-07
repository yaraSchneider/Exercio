import Exerciocios.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int escolha;

        do {

            System.out.println("\n ---- MENU ----");
            System.out.println("0 - Sair do Sistema ");
            System.out.println("1 - Atividade Aleatorio ");
            System.out.println("2 - Atividade Banco ");
            System.out.println("3 - Atividade Contas ");
            System.out.println("4 - Atividade Impar e Par ");
            System.out.println("5 - Atividade Loja ");
            System.out.println("7 - Atividade Mês ");
            System.out.println("8 - Atividade Notas ");
            System.out.println("9 - Atividade Tabuada1 ");
            System.out.println("10 - Atividade Tabuada2 ");
            System.out.println("11 - Atividade Tabuada3 ");
            System.out.println("12 - Atividade Triangulo ");

            System.out.println("\nInforme sua escolha: ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 0:
                    break;
                case 1:
                    Aleatorio.main(args);
                    break;
                case 2:
                    Banco.main(args);
                    break;
                case 3:
                    Contas.main(args);
                    break;
                case 4:
                    Impar_Par.main(args);
                    break;
                case 5:
                    Loja.main(args);
                    break;
                case 6:
                    Mes.main(args);
                    break;
                case 7:
                    Notas.main(args);
                    break;
                case 8:
                    Tabuada1.main(args);
                    break;
                case 9:
                    Tabuada2.main(args);
                    break;
                case 10:
                    Tabuada3.main(args);
                    break;
                case 11:
                    Triangulo.main(args);
                    break;
                default:
                    System.out.println("!!! INVÁLIDO !!!");
            }

        }while (escolha != 0);
    }
}