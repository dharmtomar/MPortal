package mPortalRegression_TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import mPortalReggression_ObjectPages.ChanngePassword;

public class ChangePassword_Test extends  Baseclass {

	ChanngePassword pass;
	@Test
	public void cahngePassword() throws IOException {
		pass=new ChanngePassword(odriver);
		pass.Channgepassword();
	}
}
