package mPortalReggression_ObjectPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utills.Common;

public class RiskMgt extends Common{

	public RiskMgt(WebDriver odriver) {
		this.odriver=odriver;
	}
	public void riskMgt() throws IOException {
		System.out.println("This is risk mgt");
		custom_click(odriver, By.xpath(getlocvalue("RiskMgt")), 20);
				
	}
}
