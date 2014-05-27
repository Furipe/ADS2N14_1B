package com.senac.jogos;

public class Jogador {
	
	private int pontos;
	private boolean passou = false;
	
	public boolean getPassou() 
	{
		return passou;
	}

	public void setPassou(boolean passou) 
	{
		this.passou = passou;
	}

	public Jogador()
	{
		this.pontos = 0;
	}
	
	public int getPontos()
	{
		return pontos;
	}

	public void addPontos(int amount)
	{
		pontos += amount;
	}
	
	public void subtractPontos(int amount)
	{
		pontos -= amount;
	}
	
	public void setPontos(int pontos)
	{
		this.pontos = pontos;
	}
	
}










