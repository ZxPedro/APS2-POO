package com.suam;

public class OcorrenciaHomicidio extends OcorrenciaPolicial implements Morte {

	private String localAssassinato;

	public String getLocalAssassinato() {
		return localAssassinato;
	}

	public void setLocalAssassinato(String localAssassinato) {
		this.localAssassinato = localAssassinato;
	}
	
	@Override
	public void informaLocalAssassinato(String localAssassinato) {
		this.setLocalAssassinato(localAssassinato);
	}
	
	@Override
	public String exibeInfoOcorrencia() {
		return (
				"OCORRÊNCIA DE HOMICÍDIO NÚMERO: " + this.getNumero() + 
				"\n NOME DA VÍTIMA: " + this.getNomeVitima() +
				"\n DESCRIÇÃO DA OCORRÊNCIA: " + this.getDescricaoOcorrencia() +
				"\n LOCAL DO ASSASSINATO: " + this.getLocalAssassinato() 
				);
	}
	
}
