package com.estructurales.flyweight;

public class Soldier implements Enemy {

	private String weapon;
	private final String LIFE;
	
	public Soldier() {
		LIFE = "200";
	}

	@Override
	public void setWeapon(String weapon) {
		this.weapon=weapon;
		System.out.println("El arma del soldado es: " + weapon);

	}

	@Override
	public void lifePoints() {
		
		System.out.println("LA vida de un soldado es: " + LIFE);
	}

}
