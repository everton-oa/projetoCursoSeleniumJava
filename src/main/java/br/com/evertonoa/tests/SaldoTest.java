package br.com.evertonoa.tests;

import br.com.evertonoa.core.BaseTest;
import br.com.evertonoa.pages.HomePage;
import br.com.evertonoa.pages.MenuPage;
import org.junit.Assert;
import org.junit.Test;

public class SaldoTest extends BaseTest {
    private HomePage homePage = new HomePage();
    private MenuPage menuPage = new MenuPage();

    @Test
    public void testSaldoConta(){
        menuPage.acessarTelaPrincipal();
        Assert.assertEquals("534.00", homePage.obterSaldoConta("Conta para saldo"));
    }
}
