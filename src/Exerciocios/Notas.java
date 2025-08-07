package Exerciocios;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        double nota, soma = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        int quantidade = 0;
        String opcao;

        do {
            System.out.print("Digite uma nota: ");
            nota = sc.nextDouble();

            // Atualiza soma, quantidade, maior e menor
            soma += nota;
            quantidade++;

            if (nota > maior) maior = nota;
            if (nota < menor) menor = nota;

            // Pergunta se quer lançar outra nota
            System.out.print("Deseja lançar outra nota? (S/N): ");
            sc.nextLine(); // limpa o buffer
            opcao = sc.nextLine().trim().toUpperCase();

        } while (opcao.equals("S"));

        // Cálculo da média
        double media = soma / quantidade;

        // Determina a situação
        String situacao;
        if (media >= 7.0) {
            situacao = "Aprovado";
        } else if (media >= 4.0) {
            situacao = "Exame";
        } else {
            situacao = "Reprovado";
        }

        // Exibe os resultados
        System.out.println("\n--- Resultado Final ---");
        System.out.println("Aluno: " + nome);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Quantidade de notas: " + quantidade);
        System.out.printf("Média: %.2f\n", media);
        System.out.println("Situação: " + situacao + " - " + nome);

    }
}
