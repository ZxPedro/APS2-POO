package com.suam;

public class OcorrenciaLatrocinio extends OcorrenciaPolicial implements Morte, Roubo {

	private int valorRoubado;
	private String localAssassinato;
	
	public int getValorRoubado() {
		return valorRoubado;
	}

	public void setValorRoubado(int valorRoubado) {
		this.valorRoubado = valorRoubado;
	}

	public String getLocalAssassinato() {
		return localAssassinato;
	}

	public void setLocalAssassinato(String localAssassinato) {
		this.localAssassinato = localAssassinato;
	}

	@Override
	public void informaValorRoubado(int valorRoubado) {
		this.setValorRoubado(valorRoubado);
	}

	@Override
	public void informaLocalAssassinato(String localAssassinato) {
		this.setLocalAssassinato(localAssassinato);
	}

	@Override
	public String exibeInfoOcorrencia() {
		return (
				"OCORRÊNCIA DE LATROCÍNIO NÚMERO: " + this.getNumero() + 
				"\n NOME DA VÍTIMA: " + this.getNomeVitima() +
				"\n DESCRIÇÃO DA OCORRÊNCIA: " + this.getDescricaoOcorrencia() +
				"\n LOCAL DO ASSASSINATO: " + this.getLocalAssassinato() +
				"\n VALOR ROUBADO: " + this.getValorRoubado()
				);
	}

}
