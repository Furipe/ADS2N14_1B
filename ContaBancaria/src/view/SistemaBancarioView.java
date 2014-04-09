package view;

import java.util.Scanner;

import controller.ClienteController;
import controller.Controller;
import model.ContaComum;
import model.ContaEspecial;

public class SistemaBancarioView 
{

	public static final Scanner teclado = new Scanner (System.in);
	public void printConta() 
	{
		
	}
	public void welcome()
	{
		printConta();

		
		ClienteController clientev = new ClienteController();			
		System.out.println("Nome: "+clientev.randomNome()
							+"\nNúmero: "+clientev.geradorFone()
							+"\nEndereço: "+clientev.geradorEndereco());
		
		Controller sistemabancario = new Controller();
		System.out.println("Conta: " + sistemabancario.geradorConta()
							+"Verificação: " + sistemabancario.geradorVerificacao());
		
		ContaEspecial contae = new ContaEspecial(0, 0, 0, 0);

		System.out.println("\nBem vindo ao Sistema do Banco Phantom Negócios.\n"
							+ "Qual o tipo de conta que gostaria de criar:\n"
							+ "1 - Conta Comum\n"
							+ "2 - Conta Especial\n"
							+ "3 - Conta Investimento\n"
							+ "0 - Sair do programa.");

		int opTipo = teclado.nextInt();
			
		switch (opTipo)
		{
		
			case 0: 
		{
			System.out.println("Volte Sempre.");
			System.exit(0);
		}
		
			case 1: 
		{
				System.out.println("Tipo de conta escolhida: Conta Comum.\n"
									+ "Saldo atual: " + sistemabancario.geradorSaldo());
				
				new ContaComum();
				
				Conta.menuConta();
				break;
				
		}
			case 2: 
		{
				System.out.println("Tipo de conta escolhida: Conta Especial.\n"
									+ "Nossa conta Especial conta com um limite de até 1000 reais."
									+ "Saldo atual: " + sistemabancario.geradorSaldo()
									+ "Limite atual: "+ contae.getLimite() );
				
				SDContaE.menuConta();
				break;
				
		}
			case 3: 
		{
				System.out.println("Tipo de conta escolhida: Conta Investimento.\n"
									+ "Saldo atual: " + sistemabancario.geradorSaldo());
				
				SDContaI.menuConta();
				break;
		
		}
			default:
		{
				System.out.println("\nOpção inválida, tente novamente ou digite '0' para sair.\n");
				welcome();
				break;
				
		}

		}		

	}

}