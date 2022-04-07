package com.estructurales.proxy;

public class AccessToInternet implements Internet {

	@Override
	public void connectTo(String url) throws Exception {
		System.out.println("Conectado a: " + url);

	}

}
