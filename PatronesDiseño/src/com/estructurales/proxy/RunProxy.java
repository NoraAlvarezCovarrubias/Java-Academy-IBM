package com.estructurales.proxy;

public class RunProxy {

	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
		
		try {
			internet.connectTo("ibm.com");
			internet.connectTo("facebook.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
