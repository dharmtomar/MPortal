package mPortalRegression_TestPages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

public class Homepage_Test extends Baseclass {

	@Test
	public void merchantHome() throws IOException {
		String atitle=odriver.getTitle();
		System.out.println("This is merchant portal home page");
		assertEquals(atitle, getdatavalue("etitle"));
	}
}
