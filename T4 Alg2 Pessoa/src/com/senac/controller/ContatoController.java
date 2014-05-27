package com.senac.controller;

import com.senac.model.ContatoModel;

public class ContatoController
{
	private ContatoModel contato;
	public ContatoController(String nome, String telefone, String tipoTelefone,	String endereco)
	{
		
		contato = new ContatoModel(nome, telefone, tipoTelefone, endereco);
		
	}
	public ContatoModel getContato()
	{
		
		return contato;
		
	}
	public void setContato(ContatoModel contato)
	{

		this.contato = contato;
		
	}
}
