package br.com.evertonoa.core;

import static br.com.evertonoa.core.driverFactory.killDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

import br.com.evertonoa.pages.LoginPage;

public class BaseTest {
	
	private LoginPage page = new LoginPage();
	
	@Rule
	public TestName testName = new TestName();
	
	@Before
	public void inicializa() {
		page.acessarTelaInicial();
		
		page.fazerLogin("usuario@user.com", "123");
		
	}
	
	
	@After
	public void tearDown() {
		
//		TakesScreenshot ss = (TakesScreenshot) getDriver();
//		File arquivo = ss.getScreenshotAs(OutputType.FILE);
//		Fileutils
		
		if (Propriedades.FECHAR_BROUSER) {
			killDriver();
		}
	}
}
