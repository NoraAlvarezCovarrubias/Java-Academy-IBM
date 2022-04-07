package com.estructurales.flyweight;

import java.util.Random;

public class RunFlyweight {

	public static String[] weapon = {"Fusil", "Revolver", "Resortera", "Lanza Cohetes", "Metralleta", "Machete", "Cuerno de Chivo"};
	public static String[] enemyTypes= {"Soldier", "Leader"};
	
	public static void main(String[] args) {
		for(int i=0; i<15;i++) {
			Enemy enemy = EnemyFactory.getEnemy(getRandomEnemyType());
			enemy.setWeapon(getRandomWeapon());
			enemy.lifePoints();
		}

	}
	
	public static String getRandomEnemyType() {
		Random enemyRandom= new Random();
		int ranInt= enemyRandom.nextInt(enemyTypes.length);
		
		return enemyTypes[ranInt];
	}
	
	public static String getRandomWeapon() {
		Random weaponRandom= new Random();
		int ranInt= weaponRandom.nextInt(weapon.length);
		
		return weapon[ranInt];
	}

}
