package com.estructurales.flyweight;

public class Leader implements Enemy {

	private String weapon;
	private final String LIFE;
	
	public Leader() {
		LIFE = "1000";
	}

	@Override
	public void setWeapon(String weapon) {
		this.weapon=weapon;
		System.out.println("El arma del leader es: " + weapon);

	}

	@Override
	public void lifePoints() {
		
		System.out.println("LA vida de un leader es: " + LIFE);
	}

}
