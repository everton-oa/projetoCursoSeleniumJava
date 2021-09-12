package br.com.evertonoa.tests;

import br.com.evertonoa.core.BaseTest;
import br.com.evertonoa.pages.ContasPage;
import br.com.evertonoa.pages.MenuPage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoverMovimentacaoContaTest extends BaseTest {

    MenuPage menuPage = new MenuPage();
    ContasPage contasPage = new ContasPage();

    @Test
    public void testExcluirContaComMovimentacao(){
        menuPage.acessarTelaListarConta();

        contasPage.clicarExcluirConta("Conta com movimentacao");

        assertEquals("Conta em uso na movimentações", contasPage.obterMensagemErro());
    }
}
