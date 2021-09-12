package br.com.evertonoa.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.evertonoa.core.BaseTest;
import br.com.evertonoa.pages.ContasPage;
import br.com.evertonoa.pages.MenuPage;

public class ContaTest extends BaseTest {

	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	
	@Test
	public void  testInserirConta() {
		menuPage.acessarTelaAdicionarConta();
		
		contasPage.setNome("Nova Conta Inserida");
		contasPage.clicarBotaoSalvar();
		
		assertEquals("Conta adicionada com sucesso!", contasPage.obterMensagemSucesso());
	}
	
	@Test
	public void  testAlterarConta() {
		menuPage.acessarTelaListarConta();
		
		contasPage.clicarAlterarConta("Conta para alterar");
		contasPage.setNome("Conta Alterada");
		contasPage.clicarBotaoSalvar();
		
		assertEquals("Conta alterada com sucesso!", contasPage.obterMensagemSucesso());

	}
	
	@Test
	public void inserirContaMesmoNome() {
		menuPage.acessarTelaAdicionarConta();
		
		contasPage.setNome("Conta mesmo nome");
		contasPage.clicarBotaoSalvar();
		
		assertEquals("Já existe uma conta com esse nome!", contasPage.obterMensagemErro());
	}
}
