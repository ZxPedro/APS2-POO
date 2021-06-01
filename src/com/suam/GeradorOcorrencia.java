package com.suam;

import javax.swing.JOptionPane;

public class GeradorOcorrencia {
	public static void main(String[] args) {

		GeradorOcorrencia menu = new GeradorOcorrencia();
		menu.getMenu();
	}

	private String getMenu() {
		String opcao = JOptionPane.showInputDialog(
				"O que você deseja fazer?\n1- Fazer um BO de um Latrocínio\n2- Fazer um BO de um Furto\n3- Fazer um BO de um Homicídio");

		switch (opcao) {
		case "1":
			OcorrenciaLatrocinio latrocinio = new OcorrenciaLatrocinio();

			latrocinio.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero da ocorrência")));
			
			latrocinio.setNomeVitima(JOptionPane.showInputDialog("Entre com o nome da vítima"));
			latrocinio.setDescricaoOcorrencia(JOptionPane.showInputDialog("Entre com a descrição da ocorrência"));
			latrocinio.setValorRoubado(Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor roubado")));
			latrocinio.setLocalAssassinato(JOptionPane.showInputDialog("Entre com o local do assassinato"));
			JOptionPane.showMessageDialog(null, latrocinio.exibeInfoOcorrencia());
			break;

		case "2":
			OcorrenciaFurto furto = new OcorrenciaFurto();

			furto.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero da ocorrência")));
			furto.setNomeVitima(JOptionPane.showInputDialog("Entre com o nome da vítima"));
			furto.setDescricaoOcorrencia(JOptionPane.showInputDialog("Entre com a descrição da ocorrência"));
			furto.setValorRoubado(Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor roubado")));
			JOptionPane.showMessageDialog(null, furto.exibeInfoOcorrencia());
			break;

		case "3":
			OcorrenciaHomicidio homicidio = new OcorrenciaHomicidio();

			homicidio.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero da ocorrência")));
			homicidio.setNomeVitima(JOptionPane.showInputDialog("Entre com o nome da vítima"));
			homicidio.setDescricaoOcorrencia(JOptionPane.showInputDialog("Entre com a descrição da ocorrência"));
			homicidio.setLocalAssassinato(JOptionPane.showInputDialog("Entre com o local do assassinato"));
			JOptionPane.showMessageDialog(null, homicidio.exibeInfoOcorrencia());
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
		}

		return "ok";

	}
}
