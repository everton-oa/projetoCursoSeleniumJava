package br.com.evertonoa.tests;

import br.com.evertonoa.core.BaseTest;
import br.com.evertonoa.pages.MenuPage;
import br.com.evertonoa.pages.ResumoPage;
import org.junit.Assert;
import org.junit.Test;

public class ResumoTest extends BaseTest {

    private MenuPage menuPage = new MenuPage();
    private ResumoPage resumoPage = new ResumoPage();
    @Test
    public void testExcluirResumo(){
        menuPage.acessarTelaResumoMensal();

        resumoPage.excluirMovimentacao();

        Assert.assertEquals("Movimentação removida com sucesso!", resumoPage.obterMensagemSucesso());


    }
}
