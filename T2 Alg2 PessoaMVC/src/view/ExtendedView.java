package view;


public class ExtendedView extends ContatoView 
{
	public void printContato(String nome, String fone, String endereco, String tipo, int codArea)
	{
		System.out.println("Nome: "+nome);
		System.out.println("Tipo de Telefone: "+tipo+" | Número: "+fone);
		System.out.println("Endereco: "+endereco);
	}

}