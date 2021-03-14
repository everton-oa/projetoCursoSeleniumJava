package page;

import static br.com.evertonoa.core.driverFactory.getDriver;

import br.com.evertonoa.core.BasePage;

public class LoginPage extends BasePage {
	
	public void acessarTelaInicial() {
		getDriver().get("https://srbarriga.herokuapp.com/");
	}
	public void setEmail(String email) {
		escrever("email", "usuario@user.com");
	}
	
	public void setSenha(String senha) {
		escrever("senha", "123");
	}
	
	public void clicarBotaoEntrar() {
		clickarBotaoPorTexto("Entrar");
	}
	
	public void fazerLogin(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		clicarBotaoEntrar();
	}
	

}
