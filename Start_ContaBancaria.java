// Desenvolvedor: Pablo Rodrigues
// GitHub: https://github.com/PabloR18

package aplication;

import java.util.Scanner;

import util.Conta_Bancaria;

public class Start_ContaBancaria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Conta_Bancaria conta; 
		conta = new Conta_Bancaria(null, 0);
		
		System.out.print("Informe o nome do titular da Conta: ");
		String titularDaConta = entrada.nextLine();
		conta.setNomeDoTitular(titularDaConta);
		
		System.out.print("Informe o número da Conta: ");
		int numeroDaConta = entrada.nextInt();
		conta.setNumeroDaConta(numeroDaConta);
		
		System.out.print("Deseja fazer um deposito Inicial? (SIM / NÃO): ");
		String escolha = entrada.next();
		
		switch (escolha) {
		case "sim", "SIM":
			System.out.print("Informe o valor que deseja Depositar: ");
			double valorDeposito = entrada.nextDouble();
			conta.depositar(valorDeposito);
			conta.informacoesDaConta();
			conta.menuDaConta(entrada);
			break;
		case "não", "nao", "NAO", "NÃO":
			conta.informacoesDaConta();
			conta.menuDaConta(entrada);
		default:
			break;
		}
		
		entrada.close();

	}

}
