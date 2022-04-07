package com.estructurales.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
	
	private Internet internet = new AccessToInternet();
	
	public static List<String> bannerUrl;
	
	static {
		bannerUrl = new ArrayList<>();
		bannerUrl.add("facebook.com");
		bannerUrl.add("twitter.com");
		bannerUrl.add("php.net");
	}

	@Override
	public void connectTo(String url) throws Exception {
		if(bannerUrl.contains(url)) {
			throw new Exception("URL bloqueada acceso denegado, consulta al administrador");
		}else {
			internet.connectTo(url);
		}

	}

}
