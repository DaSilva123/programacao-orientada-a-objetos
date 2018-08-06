package Teste_banco;

import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;

public class TesteConta {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		c1.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		c1.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);

		System.out.println(c1.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
	}

}
