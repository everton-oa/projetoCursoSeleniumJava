package br.com.evertonoa.pages;

import org.openqa.selenium.By;

import br.com.evertonoa.core.BasePage;

public class ContasPage extends BasePage {

	public void setNome(String nome) {
		escrever("nome", nome);
	}

	public void clicarBotaoSalvar() {
		clickarBotaoPorTexto("Salvar");
	}
	
	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}
	
	public String obterMensagemErro() {
		return obterTexto(By.xpath("//div[@class='alert alert-danger']"));
	}
	
	public void clicarAlterarConta(String nomeConta) {
		obterCelula("Conta", nomeConta, "Ações", "tabelaContas")
			.findElement(By.xpath(".//span[@class='glyphicon glyphicon-edit']")).click();
	}

	public void clicarExcluirConta(String nomeConta) {
		obterCelula("Conta", nomeConta, "Ações", "tabelaContas")
				.findElement(By.xpath(".//span[@class='glyphicon glyphicon-remove-circle']")).click();
	}
}
