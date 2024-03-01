/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco_projeto;

/**
 *
 * @author Administrator
 */
public class ContaCorrente {

    private int numeroConta;
    public String titular;
    private double saldo;
    private double taxaSaque = 0.05;
    private double limiteSaqueDiario = 1000.00;

    public ContaCorrente(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

   public boolean sacar(double valor) {
    if (valor <= 0) {
        System.out.println("Valor inválido para saque!");
        return false;
    }

    if (!limiteSaqueDiario(valor)) {
        return false;
    }

    if (saldo < valor + taxaSaque) {
        System.out.println("Saldo insuficiente para saque!");
        return false;
    }

    saldo -= valor + taxaSaque;
    System.out.println("Saque realizado com sucesso! Saldo atual: R$" + saldo);
    return true;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito!");
            return;
        }

        saldo += valor;
        System.out.println("Depósito realizado com sucesso! Saldo atual: R$" + saldo);
    }

    public boolean transferir(ContaCorrente contaDestino, double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para transferência!");
            return false;
        }

        if (valor + taxaSaque > saldo) {
            System.out.println("Saldo insuficiente para transferência!");
            return false;
        }

        saldo -= valor + taxaSaque;
        contaDestino.saldo += valor;
        System.out.println("Transferência realizada com sucesso! Saldo atual: R$" + saldo);
        return true;
    }

    public boolean limiteSaqueDiario(double valor) {
        if (valor > limiteSaqueDiario) {
            System.out.println("Valor ultrapassado para saque!");
            return false;
        }
        return true;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

}