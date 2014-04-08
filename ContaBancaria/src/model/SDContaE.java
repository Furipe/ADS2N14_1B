package model;

import java.util.Scanner;

import controller.Controller;

// Saque e Dep�sito Conta Especial
// Limite de 1000 reais.
public class SDContaE
{

static final ContaEspecial conta = new ContaEspecial(0, 0, 0, 0);
	
	public static void menuConta()
	{

		double depositov = 00.00;
		double saquev = 00.00;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("\nEscolha uma das op��es: \n"
							+ "1 - Depositar.\n"
							+ "2 - Sacar.\n"
							+ "3 - Extrato.\n"
							+ "0 - Sair do programa.\n"
							+ "Digite a op��o desejada: ");
		int opMenu = teclado.nextInt();
		
		switch (opMenu)
		{
		
			case 0:
			{
				System.out.println("Volte Sempre.");
				System.exit(0);
			}
		
			case 1:
			{
				System.out.println("Digite o valor do dep�sito : ");
				depositov = teclado.nextDouble();
				if ( depositov > 0)
				{
					conta.setDeposito(depositov);
					System.out.println("Foi depositado o valor de "+depositov+" reais na sua conta.");
					System.out.println("Saldo Atual � de: "+conta.getSaldo()+" reais.");
				}

				else if (depositov <= 0)
				{
					System.out.println("O valor depositado deve ser maior que 0 (zero).");
				}
				menuConta();
				break;

			}
		
			case 2:
			{
				System.out.println("Digite o valor do saque : ");
				saquev = teclado.nextDouble();
				
				if (conta.getSaldo() > 0 && saquev <= conta.getSaldo())
				{
					conta.setSaque(saquev);
					System.out.println("Foi sacado o valor de "+saquev+" da sua conta.\n"
							+ "Saldo autal � de: "+conta.getSaldo()+" reais.\n"
								+ "Seu limite atual � de: "+conta.getLimite());;
				}
					else if (saquev > (conta.getSaldo()+ conta.getLimite()))
					{
						System.out.println("Saldo insuficiente. Seu saldo atual � de: "+ conta.getSaldo()
												+ "\nSeu limite atual � de: "+conta.getLimite());
					}
					else if (saquev == 0)
					{
						System.out.println("Valor inv�lido. Voc� n�o pode sacar 0 (zero) reais.");
					}
					else if (saquev > conta.getSaldo() || saquev < conta.getLimite() )
					{
						conta.setSaqueL(saquev-conta.getSaldo());
						conta.setSaque(saquev);
						System.out.println("Foi sacado o valor de "+saquev+" da sua conta.\n"
								+ "Voc� utilizou seu limite para efetuar o saque.\n"
								+ "Saldo autal � de: "+conta.getSaldo()+" reais.\n"
								+"Seu limite atual � de: "+conta.getLimite());
					}		
					menuConta();
			break;
			}
		
			case 3:
			{
				if (conta.getSaldo() >= 0)
				System.out.println("Saldo atual: " + conta.getSaldo()
						+"\nSeu limite atual � de: " + conta.getLimite());
				else if (conta.getSaldo() < 0)
				System.out.println("Seu limite estourou.\n"
									+"Voc� est� com uma d�vida no valor de: " + -conta.getSaldo() + " reais.");
				menuConta();
			break;
			}
		
			default:
			{
				System.out.println("Op��o inv�lida, tente novamente ou tecle 0 para sair.");
				menuConta();
			break;
			}
		}

	}


}
