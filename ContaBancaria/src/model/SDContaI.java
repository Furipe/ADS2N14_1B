package model;

import java.sql.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

//Conta Investimento com adicional de 8.5% ao ano.

public class SDContaI 
{
	
	
static final ContaInvestimento conta = new ContaInvestimento(0, 0, 0, 0, 0);
	
	public static void menuConta()
	{

		double depositov = 0;
		double saquev = 0;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("\n");
		Calendar c = Calendar.getInstance();// Gerando calendário para datas.
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM); //Formatando Datas.
		
		System.out.println("\nData Atual: " + df.format(c.getTime()));
		System.out.println("Na nossa Conta Investimento você aumenta seu saldo em 8.5% ao ano!");
		
		System.out.println("Escolha uma das opções: \n"
							+ "1 - Depositar.\n"
							+ "2 - Sacar.\n"
							+ "3 - Extrato.\n"
							+ "4 - Verificar saldo furuto.\n"
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
						System.out.println("Sua tentativa de sacar " + saquev + " reais falhou, pois seu saldo é insuficiente.\n"
											+ "Seu saldo atual é de: "+ conta.getSaldo());
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
			
			case 4:
			{
				
				System.out.println("Saldo atual é de: " + conta.getSaldo()
									+ "\nPara quantos anos você deseja calcular seu investimento, após a data atual: " + df.format(c.getTime()) + "?");
				int dataP = teclado.nextInt();
				
				
				if (dataP > 0)
				{
						// Adicionando Anos à data atual.
						c.add(Calendar.YEAR,dataP );
						DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
						System.out.println("Você pediu o cálculo de seu investimento para a data: " + df2.format(c.getTime()));
						double taxaAno = conta.getTaxa();
						double saldoAno = conta.getSaldo();
						double invest = 0;
						for (int i = 0;i < dataP; i++)
						{
							invest = ((taxaAno*saldoAno)+ saldoAno);
							saldoAno = invest;
						}
						// Imprimindo resultado do investimento após x anos e mostrando a Data "Final" para este teste de Investimento.
						System.out.printf("\nNa data: " + df2.format(c.getTime())
								+ "\nSeu saldo será de: R$ %.2f", saldoAno);
				}
				
				else 
				{
					System.out.println("O valor de anos não pode ser menor que 0 (zero). Tente novamente.");
				}
					
				
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
