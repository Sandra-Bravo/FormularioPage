package com.qaminds.pages;
import org.openqa.selenium.By;

import com.qaminds.coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class IntroductionPage extends BasePage {
	
	public IntroductionPage(MyDriverAppium driver) {
		super(driver);
	}
	
	public final String titleIntroductionId = "section_label";
	public final String botonSkipId="intro_btn_skip";
	public final String botonNextId="intro_btn_next";
	
	public boolean getTitleIntroduction() {
		System.out.println("get in titleIntroduction");
		super.waitVisibility(By.id(titleIntroductionId));
		AndroidElement titleIntroduction = getDriver().findElementById(titleIntroductionId);
		System.out.println("get in titleIntroduction"+titleIntroduction.getText());
		return titleIntroduction.isDisplayed();
	}
	
    /*public void seleccionaSkip() {
    	super.selection(getDriver().findElementById(botonSkipId));
    	
    }    */
    public void siguiente() {
    	super.waitVisibility(By.id(botonNextId));
    	super.sigue(getDriver().findElementById(botonNextId));
		sigue(getDriver().findElementById(botonSkipId));
    	
    }
}
