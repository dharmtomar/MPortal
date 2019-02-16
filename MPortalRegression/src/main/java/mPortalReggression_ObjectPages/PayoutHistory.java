package mPortalReggression_ObjectPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utills.Common;

public class PayoutHistory extends Common {

	public PayoutHistory(WebDriver odriver) {
		this.odriver=odriver;
	}
	public void payoutHistory() throws IOException {
		System.out.println("This is payout history");
		custom_click(odriver, By.xpath(getlocvalue("PayoutHistory")), 20);
				
	}
}
