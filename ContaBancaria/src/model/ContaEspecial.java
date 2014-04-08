package model;


public class ContaEspecial extends ContaComum
{
	
	private double limite = 1000;

	public ContaEspecial (double saldo, int numConta, int numVerificacao, double limite){}
	
	public double getLimite() 
	{
		return limite;
	}

	public void setLimite(double limite) 
	{
		this.limite = limite;
	}
	
	public void setSaqueL(double valSaqueL) 
	{
		this.limite = getLimite() - valSaqueL;
	}

	

}
