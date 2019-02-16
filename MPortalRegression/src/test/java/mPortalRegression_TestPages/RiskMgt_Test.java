package mPortalRegression_TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import mPortalReggression_ObjectPages.RiskMgt;

public class RiskMgt_Test extends Baseclass{

	RiskMgt risk;
	@Test
	public void riskmgt() throws IOException {
		risk=new RiskMgt(odriver);
		risk.riskMgt();
	}
}
