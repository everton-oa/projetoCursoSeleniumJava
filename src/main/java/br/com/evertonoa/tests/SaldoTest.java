package br.com.evertonoa.tests;

import br.com.evertonoa.core.BaseTest;
import br.com.evertonoa.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class SaldoTest extends BaseTest {
    private HomePage homePage = new HomePage();

    @Test
    public void testSaldoConta(){
        Assert.assertEquals("534.00", homePage.obterSaldoConta("Conta para saldo"));
    }
}
