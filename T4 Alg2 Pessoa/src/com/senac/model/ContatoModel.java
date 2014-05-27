package com.senac.model;

import com.senac.contato.Pessoa;

public class ContatoModel
{
	private Pessoa contato;
	
	public ContatoModel(String nome, String telefone, String tipoTelefone, String endereco)
	{
		
		contato = new Pessoa(nome, telefone, tipoTelefone, endereco);
		
	}
	public Pessoa getContato()
	{
		
		return contato;
		
	}
	public void setContato(Pessoa contato)
	{
		
		this.contato = contato;
		
	}
}