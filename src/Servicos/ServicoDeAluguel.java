package Servicos;

import Entidades.AluguelDeCarros;
import Entidades.Fatura;
import Interfaces.TaxasDeServico;

public class ServicoDeAluguel {
	
	private double precoDia;
	private double precoHora;
	
	private TaxasDeServico taxaServico;
	
	public ServicoDeAluguel() {}

	public ServicoDeAluguel(double precoDia, double precoHora, TaxasDeServico taxaServico) {
		super();
		this.precoDia = precoDia;
		this.precoHora = precoHora;
		this.taxaServico = taxaServico;
	}

	public double getPrecoDia() {
		return precoDia;
	}

	public void setPrecoDia(double precoDia) {
		this.precoDia = precoDia;
	}

	public double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}

	public TaxasDeServico getTaxaServico() {
		return taxaServico;
	}

	public void setTaxaServico(TaxasDeServico taxaServico) {
		this.taxaServico = taxaServico;
	}
	
	public void processamentoDeFatura(AluguelDeCarros ac) {
		long chegada = ac.getChegada().getTime();
		long saida = ac.getSaida().getTime();
		
		double horas = (double) (chegada-saida)/1000/60/60;
		
		double pagamento;
		
		if(horas <= 12) {
			
			pagamento = Math.ceil(horas) * this.precoHora;
		}
		else {
			pagamento = Math.ceil(horas/24) * this.precoDia;
		}
		double taxa = this.taxaServico.taxa(pagamento);
		
		Fatura f = new Fatura(pagamento, taxa);
		
		ac.setFatura(f);
		
		
		
		
		
		
		
	}

}
