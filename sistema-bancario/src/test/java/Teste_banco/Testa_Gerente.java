package Teste_banco;

import banco.ControleDeBonificacoes;
import banco.Funcionario;
import banco.Gerente;

public class Testa_Gerente {

	public static void main(String[] args) {
		
		Funcionario f1 = new Gerente();
		f1.setNome("mateus");
		f1.setSalario(1000.0);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getBonificacao());
		Funcionario f2 = new Gerente();
		f2.setSalario(500);
		
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		controle.registra(f2);
		controle.registra(f1);
	}

}
