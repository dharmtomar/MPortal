package mPortalReggression_ObjectPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utills.Common;

public class CashTxnReport extends Common {

	public CashTxnReport(WebDriver odriver) {
		this.odriver=odriver;
	}
	public void downloadCashTxnReport() throws IOException {
		System.out.println("This is Cash Transaction Report");
		custom_click(odriver, By.xpath(getlocvalue("CashTxnReportLink")), 20);
				
	}
}
