package com.senac.lab2.caminhao;

public class Tanque
{
	private Object[] vetor;
	private int QtdComb;

	public void tanque(int tamanho)
	{
		this.vetor = new Object[5];
		QtdComb=-1;
	}

	public boolean isempty()
	{
		if (QtdComb==-1)
			return true;
		else
			return false;
	}

	public int size()
	{
		return QtdComb + 1;
	}

	public Object Peek()
	{
		if (isempty())
		{
			return null;
		}
		else
			return vetor[QtdComb];
	}
	
}