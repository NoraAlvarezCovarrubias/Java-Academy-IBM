package com.db.abstractfactory;



public class ProviderFactory {
	
	public static AbstractFactory getFactory(String chooseFactory) {
		
		if("CursosRepository".equals(chooseFactory)) {
			return new NoSQLFactory();
		}else if("AlumnosRepository".equals(chooseFactory)) {
			return new RelacionalFactory();
		}
		return null;
	}

}
