package mPortalReggression_ObjectPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utills.Common;

public class CardTxnReport extends Common{

	public CardTxnReport(WebDriver odriver) {
		this.odriver=odriver;
	}
	public void downloadTxnReport() throws IOException {
		System.out.println("This is Card Transactions Report");
		custom_click(odriver, By.xpath(getlocvalue("CardTxnReportLink")), 20);
		custom_click(odriver, By.xpath(getlocvalue("TxnReportLink")), 20);
		
	}
	public void downloadMDRReport() throws IOException {
		custom_click(odriver, By.xpath(getlocvalue("MerchantHome")), 20);
		custom_click(odriver, By.xpath(getlocvalue("CardTxnReportLink")), 20);
		custom_click(odriver, By.xpath(getlocvalue("MDRReportLink")), 20);
	}
}
