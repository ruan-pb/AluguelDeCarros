package Servicos;

import Interfaces.TaxasDeServico;

public class BrasilTaxas implements TaxasDeServico {

	@Override
	public double taxa(double pagamentoBasico) {
		if(pagamentoBasico <= 100.00) {
			return pagamentoBasico*0.2;
			
		}
		else {
			return pagamentoBasico*0.15;
		}
	}

	@Override
	public double jurosComposto(double valor) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
