package br.com.evertonoa.pages;

import br.com.evertonoa.core.BasePage;

public class MenuPage extends BasePage {
	
	public void acessarTelaAdicionarConta() {
		clickarLink("Contas");
		clickarLink("Adicionar");
	}

	public void acessarTelaListarConta() {
		clickarLink("Contas");
		clickarLink("Listar");
	}
	
	public void acessarTelaMovimentacao() {
		clickarLink("Criar Movimentação");
	}

	public void acessarTelaResumoMensal() {
		clickarLink("Resumo Mensal");
	}
	

}
