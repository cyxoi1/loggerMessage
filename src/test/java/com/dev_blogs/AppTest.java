package com.dev_blogs;

import org.junit.Test;

import junit.framework.Assert;

public class AppTest {
	
	@Test
	public void testApp() {
		App app = new App();
		app.logMessages();
		Assert.assertEquals("test", "test");
	}
}