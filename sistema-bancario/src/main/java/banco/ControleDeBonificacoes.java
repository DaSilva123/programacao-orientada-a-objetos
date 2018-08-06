package banco;

public class ControleDeBonificacoes {

	private double totalDeBonificacoes = 0;
	
	public void registra(Funcionario funcionario) {
		this.totalDeBonificacoes += getTotalDeBeneficacoes();
	}
	
	public double getTotalDeBeneficacoes() {
		return this.totalDeBonificacoes;
	}
}
