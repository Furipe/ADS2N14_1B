package com.senac.data;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


import com.senac.model.Conta;

public class SalvarDadosClientes 
{

	private BufferedWriter bw;

	public SalvarDadosClientes() throws FileNotFoundException 
	{

		try 
		{

			OutputStream os = new FileOutputStream("Dados.txt");

			OutputStreamWriter osw = new OutputStreamWriter(os);

			this.bw = new BufferedWriter(osw);

		}
		
		catch (Exception e) {}
	}
	public void salvarConta(Conta conta) throws IOException 
	{

		if (conta != null) 
		{

			bw.write(String.valueOf(conta.getNumeroConta())+"\n");
			bw.write(String.valueOf(conta.getSaldo())+"\n");
			bw.write(conta.getTipo()+"\n");
			bw.write(conta.getCliente().getPessoa().getNome()+"\n");
			bw.write(String.valueOf(conta.getCliente().getPessoa()
					.getTelefone())+"\n");
			bw.write(conta.getCliente().getPessoa().getTipoTelefone()+"\n");
			bw.write(conta.getCliente().getPessoa().getEndereco()+"\n");

		}
	}
	public void fechar() throws IOException 
	{

		bw.close();
		
	}
}