package mPortalRegression_TestPages;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utills.Common;

public class Baseclass extends Common{

	@BeforeClass
	public void setup() throws IOException {
		Initialization();
	}
	@AfterClass
	public void teardown() {
		closeBrowser();
	}
}
