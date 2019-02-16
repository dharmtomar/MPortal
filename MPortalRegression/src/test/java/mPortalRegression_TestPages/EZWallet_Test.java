package mPortalRegression_TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import mPortalReggression_ObjectPages.EZWallet;

public class EZWallet_Test extends Baseclass {

	EZWallet wallet;
	@Test
	public void ezWallet() throws IOException {
		wallet=new EZWallet(odriver);
		wallet.EzWallet();
	}
}
