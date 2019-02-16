package mPortalReggression_ObjectPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utills.Common;

public class WalletTxnReport extends Common {

	public WalletTxnReport(WebDriver odriver) {
		this.odriver=odriver;
	}
	public void walletTxnReport() throws IOException {
		System.out.println("This is wallet transaction reports");
		custom_click(odriver, By.xpath(getlocvalue("WalletTxnReport")), 20);
				
	}
}
