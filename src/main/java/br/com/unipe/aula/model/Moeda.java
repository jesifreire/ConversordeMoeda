package br.com.unipe.aula.model;

public class Moeda {
//	private Double real;
	private Double dolar;
	private Double taxa;
	
	public Moeda() {}
	
	public Moeda(Double dolar, Double taxa) {
		super();
//		this.real = real;
		this.dolar = dolar;
		this.taxa = taxa;
	}

	public Double getDolar() {
		return dolar;
	}

	public void setDolar(Double dolar) {
		this.dolar = dolar;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public Double realConvertido(Double dolar, Double taxa) {
		return dolar*taxa;
	}
}
