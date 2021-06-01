package com.suam;

public class OcorrenciaFurto extends OcorrenciaPolicial implements Roubo {

	private int valorRoubado;
	
	public int getValorRoubado() {
		return valorRoubado;
	}

	public void setValorRoubado(int valorRoubado) {
		this.valorRoubado = valorRoubado;
	}
	
	@Override
	public void informaValorRoubado(int valorRoubado) {
		this.setValorRoubado(valorRoubado);
		
	}

	@Override
	public String exibeInfoOcorrencia() {
		return (
				"OCORRÊNCIA DE FURTO NÚMERO: " + this.getNumero() + 
				"\n NOME DA VÍTIMA: " + this.getNomeVitima() +
				"\n DESCRIÇÃO DA OCORRÊNCIA: " + this.getDescricaoOcorrencia() +
				"\n VALOR ROUBADO: " + this.getValorRoubado()
				);
	}

	

}
