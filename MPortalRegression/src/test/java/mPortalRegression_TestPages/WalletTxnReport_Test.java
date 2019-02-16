package mPortalRegression_TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import mPortalReggression_ObjectPages.WalletTxnReport;

public class WalletTxnReport_Test extends Baseclass{

	WalletTxnReport wallet;
	@Test
	public void walletreport() throws IOException {
		wallet=new WalletTxnReport(odriver);
		wallet.walletTxnReport();
	}
}
