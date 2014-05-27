package senac.com.view;

import com.senac.contato.Pessoa;
import com.senac.controller.ContatoController;
import com.senac.controller.GerarAleatorio;
import com.senac.data.ContatoSalvar;

public class ContatoView
{
	private ContatoController contato;
	
	public ContatoView(){}

	public ContatoController getContato()
	{
		
		return contato;
		
	}
	public void setContato(ContatoController contato)
	{
		
		this.contato = contato;
		
	}
	public static void main(String[] args)
	{
		GerarAleatorio gerar = new GerarAleatorio();
		ContatoSalvar novoContato = new ContatoSalvar("dados.txt");

		for (int i = 0; i <= 20; i++)
		{
			
			int aux = (int)((Math.random() * 90) + 10);
			novoContato.gravar("\n");
			novoContato.gravar(gerar.gerarNomeAleatorio());
			novoContato.gravar("\n");
			novoContato.gravar("Telefone ");
			novoContato.gravar(gerar.gerarTipoTelefoneAleatorio());
			novoContato.gravar(" : "+Integer.toString(aux)+" ");
			novoContato.gravar("3"+gerar.gerarNumeroAleatorio());
			novoContato.gravar("\n");
			novoContato.gravar(gerar.gerarEndereco());
			novoContato.gravar("\n");
			
		}
		novoContato.close();
	}
}