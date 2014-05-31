package view;

public class CompactView extends ContatoView
{
	@Override
	public void printContato(String nome, String fone, String endereco, String tipo, int codArea)
	{
		System.out.println(String.format("Contato: %s | Telefone %s %s", nome, tipo, fone)+"\n");
	}

}