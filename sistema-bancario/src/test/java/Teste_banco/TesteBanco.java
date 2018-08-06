package Teste_banco;

import banco.AtualizadorDeContas;
import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;

public class TesteBanco {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		
		c.deposita(100);
		cc.deposita(100);
		cp.deposita(100);
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		
		System.out.println("Saldo total: "+adc.getSaldoTotal());
	
	}

}
