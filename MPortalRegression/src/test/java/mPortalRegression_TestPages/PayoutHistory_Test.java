package mPortalRegression_TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import mPortalReggression_ObjectPages.PayoutHistory;

public class PayoutHistory_Test extends Baseclass {

	PayoutHistory payout;
	@Test
	public void payoutHistory() throws IOException {
		payout=new PayoutHistory(odriver);
		payout.payoutHistory();
	}
}
