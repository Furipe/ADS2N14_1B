package model;

public class ContaInvestimento extends ContaComum 
{

	private int dataCriacao;
	private double taxa = 0.085;
	
	public ContaInvestimento (double saldo, int numConta, int numVerificacao, double taxa, int dataCriacao){}

	public int getDataCriacao() 
	{
		return dataCriacao;
	}

	public void setDataCriacao(int dataCriacao) 
	{
		this.dataCriacao = dataCriacao;
	}

	public double getTaxa() 
	{
		return taxa;
	}
	
}
