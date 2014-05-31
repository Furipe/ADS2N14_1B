package model;

public class Cliente {
	
	private String nome;
	private String fone;
	private String endereco;
	private String tipo;
	private int codArea;
		
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getFone()
	{
		return fone;
	}
	
	public void setFone(String fone)
	{
		this.fone = fone;
	}
	
	public String getEndereco()
	{
		return endereco;
	}
	
	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}
	
	public String getTipo()
	{
		return tipo;
	}
	
	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}
	
	public int getCodArea() 
	{
		return codArea;
	}
	
	public void setCodArea(int codArea) 
	{
		this.codArea = codArea;
	}
	

}
