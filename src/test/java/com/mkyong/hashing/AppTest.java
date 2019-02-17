package com.mkyong.hashing;

import junit.framework.Assert;
//import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	private String INPUT="123456";
	
	
	//@SuppressWarnings("deprecation")
	@Test
	public void testLength() {
		Assert.assertEquals(64, App.sha256hex(INPUT).length());
	}
	
	
	@Test
	public void textHex() {
		   String expected = "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92";
	        Assert.assertEquals(expected, App.sha256hex(INPUT));
	}
	
}
