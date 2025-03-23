package org.example;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        Integer numeroConta;
        String numeroAgencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o número da conta: ");
        numeroConta = scan.nextInt();
        String correção = scan.nextLine();
        System.out.println("Digite o número da agência: ");
        numeroAgencia= scan.nextLine();
        System.out.println("Informe seu nome: ");
        nomeCliente = scan.nextLine();
        System.out.println("Digite seu saldo na conta: ");
        saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + " sua conta é " + numeroConta + ", sua agência é " + numeroAgencia + " e seu saldo é: " + saldo);

    }


}