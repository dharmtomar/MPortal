package mPortalRegression_TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import mPortalReggression_ObjectPages.MerchantProfile;

public class MerchantProfile_Test extends Baseclass {

	MerchantProfile profile;
	@Test
	public void profiletest() throws IOException {
		profile=new MerchantProfile(odriver);
		profile.merchantProfile();
	}
}
