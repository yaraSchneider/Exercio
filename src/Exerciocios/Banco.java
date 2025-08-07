package Exerciocios;

import java.util.Scanner;

    /*
    Fazer um algoritmo que leia o saldo inicial de cliente do banco e leia também um cheque que
    entrou e ANALISE se o cheque poderá ser descontado ou não, já que este cliente não possui
    limite. Se o cheque não poderá ser descontado, mostre essa informação, caso contrário,
    desconte o cheque e informe o saldo na tela.
     */

public class Banco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double cheque;
        double saldo;
        boolean limite;

        System.out.println("Digite o valor que deseja saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Digite o valor do cheque: ");
        cheque = sc.nextDouble();

        if(saldo <= 0){
            System.out.println("Saldo insuficiente");
        } else {
            limite = true;
            System.out.println("Cheque realizado com sucesso" + "\n" + "Valor debitado é de: " + (saldo - cheque));
        }
    }
}
