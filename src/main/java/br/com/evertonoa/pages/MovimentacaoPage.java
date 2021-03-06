package br.com.evertonoa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.evertonoa.core.BasePage;
import br.com.evertonoa.core.DriverFactory;

public class MovimentacaoPage extends BasePage {
	
	public void setDataMovimentacao(String data) {
		escrever("data_transacao", data);
	}

	public void setDataPagamento(String data) {
		escrever("data_pagamento", data);
	}
	
	public void setDescricao(String descricao) {
		escrever("descricao", descricao);
	}
	
	public void setInteressado(String interessado) {
		escrever("interessado", interessado);
	}
	
	public void setValor(String valor) {
		escrever("valor", valor);
	}
	
	public void setConta(String conta) {
		selecionarCombo("conta", conta);
	}
	
	public void setSituacaoPago() {
		clicarRadio("status_pago");
	}
	
	public void clicarBotaoSalvar() {
		clickarBotaoPorTexto("Salvar");
	}
	
	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}

	public List<String> obterErros() {
		List<WebElement> erros = DriverFactory.getDriver().findElements(By.xpath("//div[@class='alert alert-danger']//li"));
		List<String> retorno = new ArrayList<String>();
		for (WebElement erro: erros) {
			retorno.add(erro.getText());
		}
		return retorno;
	}
}
