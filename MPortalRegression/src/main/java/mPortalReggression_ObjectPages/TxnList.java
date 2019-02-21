package mPortalReggression_ObjectPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utills.Common;

public class TxnList extends Common {

	public TxnList(WebDriver odriver) {
		this.odriver=odriver;
	}
	public void txnList() throws IOException {
		System.out.println("This is transaction list");
		custom_click(odriver, By.xpath(getlocvalue("TxnList")), 20);
				
	}
}
