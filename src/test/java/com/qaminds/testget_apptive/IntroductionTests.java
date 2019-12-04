package com.qaminds.testget_apptive;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaminds.pages.FormularioPage;
import com.qaminds.pages.IntroductionPage;


public class IntroductionTests extends BaseTest {
	
	@Test
	public void validationTitleIntroduction() {
		System.out.println("muestrame que sirves"+ getProperty("get_apptive"));
		System.out.println("get inside validationTitle" + myDriver);
		IntroductionPage introductionPage = new IntroductionPage(myDriver);
		FormularioPage formulario = new FormularioPage(myDriver);
		introductionPage.getTitleIntroduction();
		Assert.assertTrue(introductionPage.getTitleIntroduction());
		introductionPage.siguiente();
		formulario.llenado();
		
		//introductionPage.seleccionaSkip();
		
	}
	
	/*@Test (groups= {"group2"})
	public void seleccionaBoton() {
		System.out.println("muestrame que sirves"+ getProperty("get_apptive"));
		System.out.println("selecciona boton" + myDriver);
		IntroductionPage introductionPage2 = new IntroductionPage(myDriver);
        introductionPage2.Selecciona();
	}*/
	/*@Test (groups= {"group3"})
	public void botonSiguiente() {
		System.out.println("da clic en boton siguiente");
	}*/
}
