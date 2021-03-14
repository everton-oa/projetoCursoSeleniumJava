package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import br.com.evertonoa.core.BaseTest;
import page.MenuPage;
import page.MovimentacaoPage;

public class MovimentacaoTest extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	private MovimentacaoPage movPage = new MovimentacaoPage();

	@Test
	public void testInserirMovimentacao() {
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
	
	@Test
	public void testeCamposObrigatorios() {
		menuPage.acessarTelaMovimentacao();
		
		movPage.clicarBotaoSalvar();
		
		List<String> erros = movPage.obterErros();
		assertTrue(erros.containsAll(Arrays.asList(
				"Data da Movimentação é obrigatório", "Data do pagamento é obrigatório",
				"Descrição é obrigatório", "Interessado é obrigatório",
				"Valor é obrigatório", "Valor deve ser um número")));
		assertEquals(6, erros.size());
	}
}
