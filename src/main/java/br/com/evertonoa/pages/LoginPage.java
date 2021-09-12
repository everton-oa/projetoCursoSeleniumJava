package br.com.evertonoa.pages;

import static br.com.evertonoa.core.DriverFactory.getDriver;

import br.com.evertonoa.core.BasePage;

public class LoginPage extends BasePage {

	private final String ID_FIELD_EMAIL = "email";
	private final String ID_FIELD_SENHA = "senha";
	private final String ID_BUTTON_ENTRAR = "Entrar";


	public void acessarTelaInicial() {
		getDriver().get("https://seubarriga.wcaquino.me/");
	}
	public void setEmail(String email) {
		escrever(ID_FIELD_EMAIL, email );
	}

	public void setSenha(String senha) {
		escrever(ID_FIELD_SENHA, senha);
	}

	public void clicarBotaoEntrar() {
		clickarBotaoPorTexto(ID_BUTTON_ENTRAR);
	}

	public void fazerLogin(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		clicarBotaoEntrar();
	}
}
