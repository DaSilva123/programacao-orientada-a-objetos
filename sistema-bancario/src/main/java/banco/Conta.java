package banco;

public class Conta {
	
	private int numero;
	private int agencia;
	private Cliente dono;
	protected double saldo;
	private double limite;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public Cliente getDono() {
		return dono;
	}
	public void setDono(Cliente dono) {
		this.dono = dono;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public static void setTotalDeContas(int totalDeContas) {
		Conta.totalDeContas = totalDeContas;
	}
	private static int totalDeContas;
	
	
	
	public boolean saca(double valor) {
		if(this.saldo<valor) {
			return false;
		}else {
			this.saldo -= valor;
			return true;
		}
	}
	public void deposita(double valor) {
		this.saldo += valor;
	}
	public boolean transfere(Conta destino, double valor) {
		if(this.saca(valor) == false) {
			return false;
		}else{
			destino.deposita(valor);
			return true;
		}
	}
		public static int getTotalDeContas() {
			return Conta.totalDeContas;
		
	}
		public void atualiza(double taxa){
			this.saldo += this.saldo*taxa;
		}
}
