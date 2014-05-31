package controller;

import java.util.Random;
import model.ContaComum;

public class Controller 
{

	
	Random gerador = new Random();

	public int geradorConta() 
	{
		int numConta;

		numConta = gerador.nextInt(999999999);

		return numConta;
	}

	public int geradorVerificacao() 
	{
		int numVerificacao;

		numVerificacao = gerador.nextInt(999);

		return numVerificacao;
	}

	public double geradorSaldo() 
	{
		ContaComum conta = new ContaComum();

		return conta.getSaldo();
	}
}