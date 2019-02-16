package mPortalReggression_ObjectPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utills.Common;

public class Loyalty extends Common{

	public Loyalty(WebDriver odriver) {
		this.odriver=odriver;
	}
	public void loyalty() throws IOException {
		System.out.println("This is Loyalty");
		custom_click(odriver, By.xpath(getlocvalue("Loyalty")), 20);
				
	}
}
