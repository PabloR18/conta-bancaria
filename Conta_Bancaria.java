package util;

import java.util.Scanner;

public class Conta_Bancaria {
	
	//ATRIBUTOS
	
	private String nomeDoTitular;
	private int numeroDaConta;
	private double saldo;
	private static final int taxaSaque = 5;
	
	//CONSTRUTOR
	
	public Conta_Bancaria(String nomeDoTitular, int numeroDaConta) {
		this.nomeDoTitular = nomeDoTitular;
		this.numeroDaConta = numeroDaConta;
		this.saldo = 0;
	}
	
	//GETS E SETS

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//METODOS
	
	public void depositar(double deposito) {
		this.saldo += deposito;
	}
	
	public void sacar(double saque) {
		this.saldo -= saque + taxaSaque;
	}
	
	public void informacoesDaConta() {
		System.out.println("------ INFORMAÇÕES ------");
		System.out.println(" Nome do Titular: " + getNomeDoTitular());
		System.out.println(" Número da Conta: " + getNumeroDaConta());
		System.out.println(" Saldo da Conta: R$" + getSaldo());
		System.out.println("-------------------------");
	}
	
	public void menuDaConta(Scanner entrada) {
		int escolha;
		System.out.println("----- MENU DA CONTA -----");
		System.out.println("1 - Depositar");
		System.out.println("2 - Sacar");
		System.out.println("3 - Visualizar Dados Bancarios");
		System.out.println("4 - Sair");
		System.out.print("R: ");
		escolha = entrada.nextInt();
		
		switch (escolha) {
		case 1:
			System.out.print("Informe um valor para Depositar: ");
			double deposito = entrada.nextDouble();
			depositar(deposito);
			informacoesDaConta();
			menuDaConta(entrada);
			break;
		case 2:
			System.out.print("Informe o Valor que deseja Sacar: ");
			double saque = entrada.nextDouble();
			sacar(saque);
			informacoesDaConta();
			menuDaConta(entrada);
			break;
		case 3:
			informacoesDaConta();
			menuDaConta(entrada);
			break;
		case 4:
			System.out.println("Obrigado por usar nossa Conta!!");
			break;
		default:
			System.out.println("Informe um valor Válido!!");
			menuDaConta(entrada);
			break;
		}
	}
	
	
	
	
	
	
}
