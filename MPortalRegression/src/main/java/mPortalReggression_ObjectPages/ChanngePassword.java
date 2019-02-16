package mPortalReggression_ObjectPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utills.Common;

public class ChanngePassword extends Common{

	public ChanngePassword(WebDriver odriver) {
		this.odriver=odriver;
	}
	public void Channgepassword() throws IOException {
		System.out.println("This is change password");
		custom_click(odriver, By.xpath(getlocvalue("ChanngePassword")), 20);
				
	}
}
