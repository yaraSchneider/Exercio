package Exerciocios;

import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {

        String nome;
        double precoDaCompra;
        double desconto;
        double valorDesconto;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe seu nome: ");
        nome = sc.next();

        System.out.println("Digite o preço da compra: ");
        precoDaCompra = sc.nextDouble();

        if(precoDaCompra <= 200){
            desconto = 0.1;
            valorDesconto = precoDaCompra * desconto;

        } else if(precoDaCompra >= 200 && precoDaCompra <= 500){
            desconto = 0.15;
            valorDesconto = precoDaCompra * desconto;

        } else {
            desconto = 0.2;
            valorDesconto = precoDaCompra * desconto;
        }

        System.out.println("O nome do cliente " + nome + " preço da compra " +  precoDaCompra + " o percentual de desconto " + (desconto * 100) +  " desconto " + (precoDaCompra - valorDesconto));
    }

}
