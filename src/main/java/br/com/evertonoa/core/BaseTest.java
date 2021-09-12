package br.com.evertonoa.core;

import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;

import static br.com.evertonoa.core.DriverFactory.killDriver;

public class BaseTest {

	@Rule
	public TestName testName = new TestName();

	@After
	public void tearDown() throws InterruptedException {
		if (Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}
}
