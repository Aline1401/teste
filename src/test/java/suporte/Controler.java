package suporte;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

public class Controler {

	private Acoes acoes;

	public Controler(WebDriver driver) {
		acoes = new Acoes(driver);
	}

	public void setName(String nome) {
		acoes.escrever("field-customerName", nome);
	}

	public void setLastName(String nome) {
		acoes.escrever("field-contactLastName", nome);
	}

	public void setContactFirstName(String nome) {
		acoes.escrever("field-contactFirstName", nome);
	}

	public void setPhone(String nome) {
		acoes.escrever("field-phone", nome);
	}

	public void setAddressLine1(String nome) {
		acoes.escrever("field-addressLine1", nome);
	}

	public void setAddressLine2(String nome) {
		acoes.escrever("field-addressLine2", nome);
	}

	public void setCity(String nome) {
		acoes.escrever("field-city", nome);
	}

	public void setState(String nome) {
		acoes.escrever("field-state", nome);
	}

	public void setPostalCode(String nome) {
		acoes.escrever("field-postalCode", nome);
	}

	public void setCountry(String nome) {
		acoes.escrever("field-country", nome);
	}

	public void setFromEmployeer(String nome) {
		acoes.clicarBotao("field_salesRepEmployeeNumber_chosen");
		acoes.escreverSelecao("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/div/input", nome);
		acoes.clicarEnter();
	}

	public void setCreditLimit(String nome) {
		acoes.escrever("field-creditLimit", nome);
	}

	public void clicarSalvar() {
		acoes.clicarBotao("form-button-save");
	}

	public void validaMensagemSalvar(String mensagem) {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String texto = acoes.obterTexto("report-success");
		assertEquals(mensagem, texto);

	}

	public void setSelectVersion(String nome) {
		acoes.selecionarCombo("switch-version-select", nome);
	}

	public void addCustomer() {
		acoes.botao("//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a");
	}

	public void clickGoBackToList(String name) {
		acoes.click("//*[@id=\"report-success\"]/p/a[2]");
	}

	public void searchName(String nome) {
		acoes.click("//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[3]");
		acoes.escreverSelecao("//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[3]/input", nome);
	}

	public void clickMore() {
		acoes.click("//*[@id=\"gcrud-search-form\"]/div[2]/table/tbody/tr[1]/td[2]/div[1]/div/button");
		
	}

	public void clickDelete() {
		acoes.click("//*[@id=\"gcrud-search-form\"]/div[2]/table/tbody/tr[1]/td[2]/div[1]/div/div/a[3]/span");
	}
	public void confirmaDelete() {
		acoes.click("/html/body/div[2]/div[2]/div[2]/div/div/div[3]/button[2]");
	}
	public void validaMensagemDelete(String mensagem) {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String texto = acoes.obterMensagem("/html/body/div[3]");
		assertTrue(texto.contains(mensagem));

	}
	
}
