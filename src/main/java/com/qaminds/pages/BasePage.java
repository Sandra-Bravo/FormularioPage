package com.qaminds.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.qaminds.coreappium.MyDriverAppium;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BasePage {

	private AndroidDriver<AndroidElement> driver;
	
	private final WebDriverWait wait;
	
	public BasePage(MyDriverAppium driver) {
		System.out.println("entras al constructor");
		this.wait = new WebDriverWait(driver.getDriver(),10);
		this.driver = driver.getDriver();
	}

	public AndroidDriver<AndroidElement> getDriver() {
		return driver;
	}

	public WebDriverWait getWait() {
		return wait;
	}
	
	public void waitVisibility(By locator) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}catch(TimeoutException e){
			e.printStackTrace();
		}
	}
	

	/*public void selection(AndroidElement elemento) {
		elemento.click();
	}*/
	
	public void sigue(AndroidElement elemento) {
		elemento.click();
	}

	public void escribe(AndroidElement nombre,AndroidElement estatura,AndroidElement peso)  {
		nombre.setValue("sandra");
		estatura.setValue("1.48");
		peso.setValue("78");
		
	}
	

}
