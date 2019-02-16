package mPortalReggression_ObjectPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utills.Common;

public class EZWallet extends Common{

	public EZWallet(WebDriver odriver) {
		this.odriver=odriver;
	}
	public void EzWallet() throws IOException {
		System.out.println("This is EzWallet");
		custom_click(odriver, By.xpath(getlocvalue("EZWallet")), 20);
				
	}
}
