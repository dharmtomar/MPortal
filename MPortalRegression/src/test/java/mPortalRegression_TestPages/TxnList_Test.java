package mPortalRegression_TestPages;

import java.io.IOException;

import org.testng.annotations.Test;

import mPortalReggression_ObjectPages.TxnList;

public class TxnList_Test extends Baseclass {

	TxnList txn;
	@Test
	public void testtxnlist() throws IOException {
		txn=new TxnList(odriver);
		txn.txnList();
	}
}
