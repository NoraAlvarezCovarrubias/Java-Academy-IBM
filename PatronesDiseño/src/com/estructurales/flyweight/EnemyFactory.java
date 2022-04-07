package com.estructurales.flyweight;

import java.util.HashMap;

public class EnemyFactory {
	
	private static HashMap<String, Enemy> enemies = new HashMap<>();
	
	public static Enemy getEnemy(String type) {
		Enemy enemy = null;
		
		if(enemies.containsKey(type)) {
			enemy = enemies.get(type);
		}else {
			switch (type) {
			case "Soldier": 
				System.out.println("El soldado ha sido credao");
				enemy= new Soldier();
				break;
			case "Leader": 
				System.out.println("El leader ha sido credao");
				enemy= new Leader();
				break;
			default:
				System.out.println("No se ha creado el enemigo");
				break;
			}
			enemies.put(type, enemy);
		}
		return enemy;
	}

}
