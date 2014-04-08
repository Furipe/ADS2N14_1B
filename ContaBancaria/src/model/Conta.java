package model;

import java.util.Scanner;

import controller.Controller;

// Saque e Depósito Conta Comum
public class Conta
{

static final ContaComum conta = new ContaComum();
	
	public static void menuConta()
	{

		double depositov = 0;
		double saquev = 0;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("\nEscolha uma das opções: \n"
							+ "1 - Depositar.\n"
							+ "2 - Sacar.\n"
							+ "3 - Extrato.\n"
							+ "0 - Sair do programa.\n"
							+ "Digite a opção desejada: ");
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
				System.out.println("Digite o valor do depósito : ");
				depositov = teclado.nextDouble();
				if ( depositov > 0)
				{
					conta.setDeposito(depositov);
					System.out.println("Foi depositado o valor de "+depositov+" reais na sua conta.");
					System.out.println("Saldo Atual é de: "+conta.getSaldo()+" reais.");
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
							+ "Saldo autal é de: "+conta.getSaldo()+" reais.");
				}
					else if (conta.getSaldo() < 0 || saquev > conta.getSaldo())
					{
						System.out.println("Sua tentativa de sacar "+saquev+" reais falhou, pois seu saldo é insuficiente."
											+ "\nSeu saldo atual é de: "+ conta.getSaldo());
					}
					else if (saquev == 0)
					{
						System.out.println("Valor inválido. Você não pode sacar 0 (zero) reais.");
					}
					menuConta();
			break;
			}
		
			case 3:
			{
				System.out.println("Saldo atual: " + conta.getSaldo());
				menuConta();
			break;
			}
		
			default:
			{
				System.out.println("Opção inválida, tente novamente ou tecle 0 para sair.");
				menuConta();
			break;
			}
		}

	}


}
