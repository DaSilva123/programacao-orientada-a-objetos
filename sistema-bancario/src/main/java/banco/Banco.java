package banco;

public class Banco {

	private Conta[] conta;
	private int totalContas = 0;
	
	public void adiciona(Conta c) {
		this.conta[totalContas] = c;
		this.totalContas ++;
	}
	public Conta pagaConta(int x) {
		for(int i = 0; i <= x; i++) {
			if(conta[i].equals(conta[x])) {
				return conta[x];
			}
		}
		return null;	
		
	}
	public int pegaTotalDeContas() {
		return this.totalContas;
	}
	
	
}
