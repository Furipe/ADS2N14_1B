package app;

import view.Conta;
import view.SistemaBancarioView;

public class SistemaBancario {

	public static void main(String[] args) {

		SistemaBancarioView sist = new SistemaBancarioView();

		sist.welcome();
		sist.printConta();
		Conta.menuConta();

	}

}