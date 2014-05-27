package com.senac.controller;

public class GerarAleatorio
{
	public String gerarNomeAleatorio()
	{
		
		String[] nome = { "Alice", "Ayumi", "Azumi", "Dean", "Ein", "Edward",
				"Goku", "Haruhi", "Natsume", "Mireille", "Rei", "Sam", "Zwei" };
		String[] sobreNome = { "Aoki", "Ayanami", "Endo", "Fritz", "Heinz", "Sasaki",
				"von Aaron", "Zeiss" };
		int aux1 = (int) (Math.random() * nome.length - 1);
		int aux2 = (int) (Math.random() * sobreNome.length - 1);
		return nome[aux1] + " " + sobreNome[aux2];
		
	}
	public String gerarTipoTelefoneAleatorio()
	{
		
		int aux = 0;
		aux = (int) (Math.random() * 3);
		String[] tipoTelefoneAleatorio = { "Pessoal", "Comercial",
				"Residencial" };
		return tipoTelefoneAleatorio[aux];
		
	}
	public String gerarNumeroAleatorio()
	{
		
		String numeroAleatorio = "";
		int prefixo  = ((int) (Math.random() * 900)+ 100);
		int sufixo = ((int) (Math.random() * 9000)+ 1000);
		numeroAleatorio = (prefixo+"."+ sufixo);
		return numeroAleatorio;
		
	}
	public String gerarEndereco()
	{
		String[] rua = { "Av. Alberto Bins", "Av. Assis Brasil",
				"Av. Sertorio", "Av. Pernambuco",
				"R. Coronel Genuino", "R. Getulio Vargas" };
		String[] cidade = { "Canoas", "Novo Hamburgo", "Porto Alegre", "Santa Maria" };
		int numero = (int) (Math.random() * 1000);
		int aux1 = (int) (Math.random() * rua.length - 1);
		int aux2 = (int) (Math.random() * cidade.length - 1);
		return rua[aux1] + " " + numero + " - " + cidade[aux2];
	}
}