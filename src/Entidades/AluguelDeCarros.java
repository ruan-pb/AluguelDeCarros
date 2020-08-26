package Entidades;

import java.util.Date;

public class AluguelDeCarros {
	
	private Date  saida;
	private Date chegada;
	
	private Veiculo veiculo;
	private Fatura fatura;
	
	public AluguelDeCarros() {}

	public AluguelDeCarros(Date saida, Date chegada, Veiculo veiculo) {
		super();
		this.saida = saida;
		this.chegada = chegada;
		this.veiculo = veiculo;
			}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}

	public Date getChegada() {
		return chegada;
	}

	public void setChegada(Date chegada) {
		this.chegada = chegada;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
	
	
	

}
