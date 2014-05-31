package com.senac.jogos.apps.Matching.view;

import static java.lang.System.out;

import java.util.Scanner;

import com.senac.jogos.Jogador;
import com.senac.jogos.apps.Matching.controller.JogoController;
import com.senac.jogos.apps.Matching.model.MatchingCardGame;

public class JogoView 
{
	private static Scanner teclado = new Scanner(System.in);
	
	private static JogoController controller = new JogoController();
		
	public static Jogador jogador1 = new Jogador();
	public static Jogador jogador2 = new Jogador();
	public static Jogador jogador3 = new Jogador();
	public static Jogador jogador4 = new Jogador();
	
	public static void main(String[] args)
	{
		int i=1;
		while (i<=10)
		{
			out.println(
					"Carta na mesa: " + controller.showMesa()
					);

			out.print("Digite 'jogar' para jogar, 'pular' para passar a vez: ");
		
			String comando = teclado.next();
			if (comando.equalsIgnoreCase("JOGAR"))
			{
				out.println(
						"Carta do jogador: " + controller.showCartaJogador()
						);
				controller.playTurno(comando);
			}
			else if (comando.equalsIgnoreCase("PULAR"))
			{
				MatchingCardGame game = new MatchingCardGame();
				game.pulaJogada(comando);
				i--;
			}
		i++;
		}
	}
	
}
