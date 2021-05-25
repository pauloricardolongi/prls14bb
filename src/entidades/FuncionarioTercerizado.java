package entidades;

public class FuncionarioTercerizado extends Funcionario {
private Double adicionarGastos;
	
	

	public FuncionarioTercerizado() {
		super();
	}



	public FuncionarioTercerizado(String nome, Integer horas, Double valorPorHora, Double adicionarGastos) {
		super(nome, horas, valorPorHora);
		this.adicionarGastos = adicionarGastos;
	}



	public Double getAdicionarGastos() {
		return adicionarGastos;
	}



	public void setAdicionarPagamento(Double adicionarGastos) {
		this.adicionarGastos= adicionarGastos;
	}
	@Override
	public double pagamento() {
		return super.pagamento() + adicionarGastos * 1.1;
		
		//recebe o mesmo pagamento do funcionário normal
		//horas* valorPorhora + 110% adicionalGasto
		
	}



}
