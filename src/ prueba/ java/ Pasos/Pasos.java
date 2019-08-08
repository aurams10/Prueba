package Prueba.Prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Pasos {
	
	public WebDriver driver=null;
	
	@Given("^Abrir el navegador$") 
		
	public void open_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ext_admunoz\\eclipse-workspace\\Prueba\\Prueba\\src\test\\java\\Recursos\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
		

	@And("^Enter the URL$")
	public void enter_the_URL(String arg1) throws Throwable {
		driver.get("https://www.google.com");
	}

	
	
	@When("^Ingresar la palabra Pruebaz$")
	public void enter_registered_username_and_password() throws Throwable {
		driver.findElement(By.name("q")).sendKeys("Pruebaz");
		
	}
		
	

	@And("^Click en el boton$")
		public void click_on_login_button() throws Throwable {
		driver.findElement(By.name("btnK")).click();
	}
		

	@Then("^Validar que se cargue la palabra correcta$")
	
	public void user_must_successfully_login_to_the_web_page() throws Throwable {
		  String capText= driver.findElement(By.xpath("//i[contains(text(),'pruebas')]")).getText();
		  Assert.assertEquals(true,capText.contains("Pruebas"));
		}
	
	

}
