package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.evertonoa.core.BaseTest;
import page.MenuPage;
import page.MovimentacaoPage;

public class MovimentacaoTest extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	private MovimentacaoPage movPage = new MovimentacaoPage();

	@Test
	public void testInserirMovimentacao() throws InterruptedException {
		Thread.sleep(1000);
		menuPage.acessarTelaMovimentacao();
		
		movPage.setDataMovimentacao("01/01/2017");
		movPage.setDataPagamento("01/01/2018");
		movPage.setDescricao("Descriçao do movimento");
		movPage.setInteressado("Interessado");
		movPage.setValor("100");
		movPage.setConta("Conta Alterada");
		movPage.setSituacaoPago();
		movPage.clicarBotaoSalvar();
		
		assertEquals("Movimentação adicionada com sucesso!", movPage.obterMensagemSucesso());

		
	}
}
