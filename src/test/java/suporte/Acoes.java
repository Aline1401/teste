package suporte;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Acoes {

	private WebDriver driver;

	public Acoes(WebDriver driver) {
		this.driver = driver;
	}

	public void clicarEnter() {
		WebElement webElement = driver.findElement(By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/div/input"));
		webElement.sendKeys(Keys.ENTER);
	}
		
	public void escrever(By by, String texto) {
		driver.findElement(by).clear();
		driver.findElement(by).sendKeys(texto);
	}

	public void escrever(String id_campo, String texto) {
		escrever(By.id(id_campo), texto);
	}
	public void escreverSelecao(String id_campo, String texto) {
		escrever(By.xpath(id_campo), texto);
	}

	public void selecionarCombo(String id, String valor) {
		WebElement element = driver.findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
	
	public void clicarBotao(String id) {
		driver.findElement(By.id(id)).click();
	}
	public void botao(String id) {
		driver.findElement(By.xpath(id)).click();
	}
	public void click(String id) {
		driver.findElement(By.xpath(id)).click();
	}

	public String obterTexto(By by) {
		return driver.findElement(by).getText();
	}

	public String obterTexto(String id) {
		return obterTexto(By.id(id));
	}
	public String obterMensagem(String id){
		return obterTexto(By.xpath(id));
	}

	
}
