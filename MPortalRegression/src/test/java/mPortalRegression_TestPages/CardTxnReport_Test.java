package mPortalRegression_TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import mPortalReggression_ObjectPages.CardTxnReport;

public class CardTxnReport_Test extends Baseclass {

	CardTxnReport cardreports;
	@Test
	public void downloadcardreports() throws IOException {
		 cardreports=new CardTxnReport(odriver);
		 cardreports.downloadTxnReport();
		 cardreports.downloadMDRReport();
	}
}
