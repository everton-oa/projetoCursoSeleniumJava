package br.com.evertonoa.suites;

import br.com.evertonoa.core.DriverFactory;
import br.com.evertonoa.pages.HomePage;
import br.com.evertonoa.pages.LoginPage;
import br.com.evertonoa.tests.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ContaTest.class,
        MovimentacaoTest.class,
        RemoverMovimentacaoContaTest.class,
        SaldoTest.class,
        ResumoTest.class
})
public class SuiteGeral {

    private static LoginPage page = new LoginPage();
    private static HomePage homePage = new HomePage();
    @BeforeClass
    public static void inicializa() {
        page.acessarTelaInicial();
        page.fazerLogin("everton@everton.com", "123456");
//        page.acessarTelaInicial();
        homePage.resetarBancoDeDados();
    }

    @AfterClass
    public static void finaliza() throws InterruptedException {
        DriverFactory.killDriver();
    }
}
