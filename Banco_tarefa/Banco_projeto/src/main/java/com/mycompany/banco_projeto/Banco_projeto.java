/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco_projeto;

/**
 *
 * @author Administrator
 */
public class Banco_projeto {

    public static void main(String[] args) {
  
        ContaCorrente conta1 = new ContaCorrente(12345, "João Silva", 2000.00);
        ContaCorrente conta2 = new ContaCorrente(54321, "Maria Oliveira", 500.00);

      
        System.out.println("Conta 1: " + conta1.getTitular() + " - Saldo: R$" + conta1.getSaldo());
        System.out.println("Conta 2: " + conta2.getTitular() + " - Saldo: R$" + conta2.getSaldo());

     
        if (conta1.getSaldo() >= 1000.00) {
        conta1.sacar(1000.00);
        } else {
        System.out.println("Saldo insuficiente para saque!");
        }


        conta1.depositar(400.00);
        conta1.transferir(conta2, 100.00);

       
        System.out.println("Conta 1: " + conta1.getTitular() + " - Saldo: R$" + conta1.getSaldo());
        System.out.println("Conta 2: " + conta2.getTitular() + " - Saldo: R$" + conta2.getSaldo());
    }
}
