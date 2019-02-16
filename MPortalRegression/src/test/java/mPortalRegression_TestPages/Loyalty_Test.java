package mPortalRegression_TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import mPortalReggression_ObjectPages.Loyalty;

public class Loyalty_Test extends Baseclass {

	Loyalty loy;
	@Test
	public void loyaltytest() throws IOException {
		loy=new Loyalty(odriver);
		loy.loyalty();
	}
}
