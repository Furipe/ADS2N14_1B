package model;


public class ContaComum {

	private double saldo = 0;
	private int numConta;
	private int numVerificacao;


	public double getSaldo() 
	{
		return saldo;
	}

	public void setSaldo(double saldo) 
	{
		this.saldo = saldo;
	}

	public void setDeposito(double valDeposito) 
	{
		this.saldo = getSaldo() + valDeposito;
	}

	public void setSaque(double valSaque) 
	{
		this.saldo = getSaldo() - valSaque;
	}

	public int getNumConta() 
	{
		return numConta;
	}

	public void setNumConta(int numConta) 
	{
		this.numConta = numConta;
	}

	public int getNumVerificacao() 
	{
		return numVerificacao;
	}

	public void setNumVerificacao(int numVerificacao) 
	{
		this.numVerificacao = numVerificacao;
	}

}