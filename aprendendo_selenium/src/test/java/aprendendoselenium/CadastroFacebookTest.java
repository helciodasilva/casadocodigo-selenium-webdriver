package aprendendoselenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class CadastroFacebookTest {

	private WebDriver driver;
	private PrincipalFacebookPage page;

	@Before
	public void antes() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
	}

	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		page = PageFactory.initElements(driver, PrincipalFacebookPage.class);
	}

	@Test
	public void validaCamposObrigatorios() {
		page.clicaAbrirUmaConta();
	}
}
