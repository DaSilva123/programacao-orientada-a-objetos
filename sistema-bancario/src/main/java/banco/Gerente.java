package banco;

public class Gerente extends Funcionario {

	int senha;
	int numeroDeFuncionarosGerenciados;
	
	public double getBonificacao() {
		return super.getBonificacao()+1000;
	}
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionarosGerenciados() {
		return numeroDeFuncionarosGerenciados;
	}

	public void setNumeroDeFuncionarosGerenciados(int numeroDeFuncionarosGerenciados) {
		this.numeroDeFuncionarosGerenciados = numeroDeFuncionarosGerenciados;
	}

	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso permitido");
			return true;
		}else {
			System.out.println("acesso negado");
			return false;
		}
	}
	
}
