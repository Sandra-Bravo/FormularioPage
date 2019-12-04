package com.qaminds.pages;

import org.openqa.selenium.By;

import com.qaminds.coreappium.MyDriverAppium;

public class FormularioPage extends BasePage{
	public FormularioPage(MyDriverAppium driver) {
		super(driver);
	}
	
	public final String	nombre ="input_name";
	public final String estatura ="input_height";
	public final String peso ="input_weight";
	public final String selSexo ="input_sex";
	public final String selFemale ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]";
	public final String selEdad = "input_age";
	public final String edad="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[7]";
	public final String selDias = "input_goal";
	public final String dias="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]";
	public final String botonSig = "save_button";
	
	

	public void llenado() {
    super.waitVisibility(By.id(nombre));
   	super.escribe(getDriver().findElementById(nombre),getDriver().findElementById(estatura),getDriver().findElementById(peso));
    super.sigue(getDriver().findElementById(selSexo));
    sigue(getDriver().findElementByXPath(selFemale));
    sigue(getDriver().findElementById(selEdad));
    sigue(getDriver().findElementByXPath(edad));
    sigue(getDriver().findElementById(selDias));
    sigue(getDriver().findElementByXPath(dias));
    sigue(getDriver().findElementById(botonSig));
    }
	
}
