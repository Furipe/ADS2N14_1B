package com.senac.jogos.apps.Matching.model;

import static java.lang.System.out;

import java.util.Scanner;

import com.senac.jogos.Jogador;
import com.senac.jogos.apps.Matching.controller.JogoController;
import com.senac.jogos.apps.Matching.view.JogoView;
import com.senac.jogos.cartas.Baralho;
import com.senac.jogos.cartas.Carta;

public class MatchingCardGame
{
	private Baralho baralho;
	private Jogador jogador;
	public static int contJogador = 1;
	private static Scanner teclado = new Scanner(System.in);
	private static JogoController controller = new JogoController();
	
	private Carta mesa;
	
	public MatchingCardGame()
	{
		baralho = new Baralho();
		jogador = new Jogador();
		mesa = baralho.drawCarta();
	}
	
	public int matchCarta(Carta carta)
	{
		int score = 0;
		
		if (MatchingCardGame.contJogador == 1)
		{
			score = JogoView.jogador1.getPontos();
			if (carta.getNaipe() == mesa.getNaipe())
				score = score+1;
			if (carta.getValor() == mesa.getValor())
				score = score+4;
			else if ((carta.getNaipe() != mesa.getNaipe()) && (carta.getValor() != mesa.getValor()))
				score = score-2;
			JogoView.jogador1.setPontos(score);			
			MatchingCardGame.contJogador = 2;
			System.out.println("Pontos do jogador 1 = "+JogoView.jogador1.getPontos());
			JogoView.jogador1.setPassou(false);
			return score;
		}
		else if (MatchingCardGame.contJogador == 2)
		{
			score = JogoView.jogador2.getPontos();
			if (carta.getNaipe() == mesa.getNaipe())
				score = score+1;
			if (carta.getValor() == mesa.getValor())
				score = score+4;
			else if ((carta.getNaipe() != mesa.getNaipe()) && (carta.getValor() != mesa.getValor()))
				score = score-2;
			JogoView.jogador2.setPontos(score);			
			MatchingCardGame.contJogador = 3;
			System.out.println("Pontos do jogador 2 = "+JogoView.jogador2.getPontos());
			JogoView.jogador2.setPassou(false);
			return score;
		}
		else if (MatchingCardGame.contJogador == 3)
		{
			score = JogoView.jogador3.getPontos();
			if (carta.getNaipe() == mesa.getNaipe())
				score = score+1;
			if (carta.getValor() == mesa.getValor())
				score = score+4;
			else if ((carta.getNaipe() != mesa.getNaipe()) && (carta.getValor() != mesa.getValor()))
				score = score-2;
			JogoView.jogador3.setPontos(score);			
			MatchingCardGame.contJogador = 4;
			System.out.println("Pontos do jogador 3 = "+JogoView.jogador3.getPontos());
			JogoView.jogador3.setPassou(false);
			return score;
		}
		else if (MatchingCardGame.contJogador == 4)
		{
			score = JogoView.jogador4.getPontos();
			if (carta.getNaipe() == mesa.getNaipe())
				score = score+1;
			if (carta.getValor() == mesa.getValor())
				score = score+4;
			else if ((carta.getNaipe() != mesa.getNaipe()) && (carta.getValor() != mesa.getValor()))
				score = score-2;
			JogoView.jogador4.setPontos(score);
			MatchingCardGame.contJogador = 1;
			System.out.println("Pontos do jogador 4 = "+JogoView.jogador4.getPontos());
			JogoView.jogador4.setPassou(false);
			return score;
		}
		return 0;
	}
	public void pulaJogada(String comando)
	{
		if (MatchingCardGame.contJogador==1)
		{
			MatchingCardGame.contJogador=2;
			if (comando.equalsIgnoreCase("PULAR"))
			{
				if (JogoView.jogador1.getPassou()==false)
				{
					System.out.println("Você passou a jogada");
					JogoView.jogador1.setPassou(true);
				}
				else if (JogoView.jogador1.getPassou()==true)
				{
					JogoView.jogador1.setPassou(false);
					System.out.println("Você não pode passar a jogada!");
					System.out.println("Carta na mesa: " + controller.showMesa());
					System.out.println("Carta do jogador: " + controller.showCartaJogador());
					controller.playTurno("JOGAR");
				}
			}
		}
		else if (MatchingCardGame.contJogador==2)
		{
			MatchingCardGame.contJogador=3;
			if (comando.equalsIgnoreCase("PULAR"))
			{
				if (JogoView.jogador2.getPassou()==false)
				{
					System.out.println("Você passou a jogada");
					JogoView.jogador2.setPassou(true);
				}
				else if (JogoView.jogador2.getPassou()==true)
				{
					JogoView.jogador2.setPassou(false);
					System.out.println("Você não pode passar a jogada!");
					System.out.println("Carta na mesa: " + controller.showMesa());
					System.out.println("Carta do jogador: " + controller.showCartaJogador());
					controller.playTurno("JOGAR");
				}
			}
		}
		else if (MatchingCardGame.contJogador==3)
		{
			MatchingCardGame.contJogador=4;
			if (comando.equalsIgnoreCase("PULAR"))
			{
				if (JogoView.jogador3.getPassou()==false)
				{
					System.out.println("Você passou a jogada");
					JogoView.jogador3.setPassou(true);
				}
				else if (JogoView.jogador3.getPassou()==true)
				{
					JogoView.jogador3.setPassou(false);
					System.out.println("Você não pode passar a jogada!");
					System.out.println("Carta na mesa: " + controller.showMesa());
					System.out.println("Carta do jogador: " + controller.showCartaJogador());
					controller.playTurno("JOGAR");
				}
			}
		}
		else if (MatchingCardGame.contJogador==4)
		{
			MatchingCardGame.contJogador=1;
			if (comando.equalsIgnoreCase("PULAR"))
			{
				if (JogoView.jogador4.getPassou()==false)
				{
					System.out.println("Você passou a jogada");
					JogoView.jogador4.setPassou(true);
				}
				else if (JogoView.jogador4.getPassou()==true)
				{
					JogoView.jogador4.setPassou(false);
					System.out.println("Você não pode passar a jogada!");
					System.out.println("Carta na mesa: " + controller.showMesa());
					System.out.println("Carta do jogador: " + controller.showCartaJogador());
					controller.playTurno("JOGAR");
				}
			}
		}
	}
	public void setMesa(Carta carta)
	{
		mesa = carta;
	}
	public Carta getMesa()
	{
		return mesa;
	}
	public Carta drawCarta()
	{
		return baralho.drawCarta();
	}
	
	public Jogador getJogador()
	{
		return jogador;
	}
}
