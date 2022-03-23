package com.crm.vtiger.Demo;

import org.testng.annotations.Test;

public class ParametersTest {
	@Test
	public void gettingData() {
		System.out.println(System.getProperty("browser"));
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
	}

}
