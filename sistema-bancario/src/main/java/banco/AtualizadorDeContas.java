package banco;

public class AtualizadorDeContas {
	
	private double saldoTotal = 0;
	private double selic;
	
	
	public AtualizadorDeContas (double selic) {
		this.selic = selic;
	}
	
	public void roda(Conta c) {
		System.out.println("Saldo Anterior: "+c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Saldo Final: "+c.getSaldo()+"\n");
		
		this.saldoTotal = this.saldoTotal+c.getSaldo();
	}
	
	public double getSaldoTotal() {
		return this.saldoTotal;
		
	}
	
	
	
	
}
