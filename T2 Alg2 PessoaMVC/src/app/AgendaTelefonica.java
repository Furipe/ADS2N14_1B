package app;

import view.CompactView;
import view.ExtendedView;
import controller.PessoaController;

//Imprime os Contatos
public class AgendaTelefonica
{

	public static void main(String[] args)
	{
		for (int i=1;i<=50;i++)
		{
		PessoaController controller = new PessoaController();
		controller.criarContato();
		
		controller.exibirContato(new ExtendedView());
		controller.exibirContato(new CompactView());
		}
	}
}