package mPortalReggression_ObjectPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utills.Common;

public class MerchantProfile extends Common {

	public MerchantProfile(WebDriver odriver) {
		this.odriver=odriver;
	}
	public void merchantProfile() throws IOException {
		System.out.println("Thia is Merchant Profile");
		custom_click(odriver, By.xpath(getlocvalue("MerchantProfile")), 20);
				
	}
}
