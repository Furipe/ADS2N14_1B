package com.senac.contato;

public class Pessoa
{
	private String nome;
	private String telefone;
	private String endereco;
	private String tipoTelefone;

	public Pessoa(String nome, String telefone, String tipoTelefone, String endereco)
	{
		
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.tipoTelefone = tipoTelefone;
		
	}
	public String getTipoTelefone()
	{
		
		return tipoTelefone;
		
	}
	public void setTipoTelefone(String tipoTelefone)
	{
		
		this.tipoTelefone = tipoTelefone;
		
	}
	public Pessoa(String nome, String telefone, String endereco)
	{
		
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		
	}
	public String getNome()
	{
		
		return nome;
		
	}
	public void setNome(String nome)
	{
		
		this.nome = nome;
		
	}
	public String getTelefone()
	{
		
		return telefone;
		
	}
	public void setTelefone(String telefone)
	{
		
		this.telefone = telefone;
		
	}
	public String getEndereco()
	{
		
		return endereco;
		
	}
	public void setEndereco(String endereco)
	{
		
		this.endereco = endereco;
		
	}
}