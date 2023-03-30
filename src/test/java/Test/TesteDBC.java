package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import suporte.Controler;
import suporte.Web;

public class TesteDBC {
	private WebDriver driver;
	private Controler page;

	@Before
	public void inicializa() {
		driver = Web.createChrome();
		page = new Controler(driver);
	}

	@Test
	public void Teste1() {
		page.setSelectVersion("Bootstrap V4 Theme");
		page.addCustomer();
		page.setName("Teste Sicredi");
		page.setLastName("Teste");
		page.setContactFirstName("Aline Soares de Brito");
		page.setPhone("51 9999-9999");
		page.setAddressLine1("Av Assis Brasil, 3970");
		page.setAddressLine2("Torre D");
		page.setCity("Porto Alegre");
		page.setState("RS");
		page.setPostalCode("91000-000");
		page.setCountry("Brasil");
		page.setFromEmployeer("Fixter");
		page.setCreditLimit("200");
		page.clicarSalvar();
		page.validaMensagemSalvar(
				"Your data has been successfully stored into the database. Edit Customer or Go back to list");
	}

	@Test
	public void Teste2() {
		{
			page.setSelectVersion("Bootstrap V4 Theme");
			page.addCustomer();
			page.setName("Teste Sicredi");
			page.setLastName("Teste");
			page.setContactFirstName("Aline Soares de Brito");
			page.setPhone("51 9999-9999");
			page.setAddressLine1("Av Assis Brasil, 3970");
			page.setAddressLine2("Torre D");
			page.setCity("Porto Alegre");
			page.setState("RS");
			page.setPostalCode("91000-000");
			page.setCountry("Brasil");
			page.setFromEmployeer("Fixter");
			page.setCreditLimit("200");
			page.clicarSalvar();
			page.validaMensagemSalvar(
					"Your data has been successfully stored into the database. Edit Customer or Go back to list");
			page.clickGoBackToList("Go back to list");
			page.searchName("Teste Sicredi");
			page.clickMore();
			page.clickDelete();
			page.confirmaDelete();
			page.validaMensagemDelete("Your data has been successfully deleted from the database.");

		}
	}

	@After
	public void Fechar() {
		driver.quit();
	}
}
