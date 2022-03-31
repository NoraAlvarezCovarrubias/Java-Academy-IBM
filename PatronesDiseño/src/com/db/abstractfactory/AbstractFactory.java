package com.db.abstractfactory;

public interface AbstractFactory<T> {
	T createRepositoryAlumnos(String type);
	T createRepositoryCursos(String type);
}
