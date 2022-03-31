package com.db.abstractfactory;

import java.util.stream.Collectors;

public class RunAbstractFactory {

	public static void main(String[] args) {
		AbstractFactory abstractFactoryCursos = ProviderFactory.getFactory("CursosRepository");
		CursosRepository cursos = (CursosRepository) abstractFactoryCursos.createRepositoryCursos("CursosNoSQL");
		
		AbstractFactory abstractFactoryAlumnos = ProviderFactory.getFactory("AlumnosRepository");
		AlumnosRepository alumnos = (AlumnosRepository) abstractFactoryAlumnos.createRepositoryAlumnos("AlumnosRelacional");
		
		System.out.println(String.format("Lista de cursos No SQL %s ", cursos.listaCursos().stream().collect(Collectors.toList())));
		
		System.out.println(String.format("Lista de alumnos Relacional %s ", alumnos.listaAlumnos().stream().collect(Collectors.toList())));

	}

}
