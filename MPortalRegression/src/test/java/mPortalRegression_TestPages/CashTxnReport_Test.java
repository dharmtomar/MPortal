package mPortalRegression_TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import mPortalReggression_ObjectPages.CashTxnReport;

public class CashTxnReport_Test extends Baseclass {

	CashTxnReport cashreport;
	@Test
	public void downloadcashreport() throws IOException {
		cashreport=new CashTxnReport(odriver);
		cashreport.downloadCashTxnReport();
	}
}
