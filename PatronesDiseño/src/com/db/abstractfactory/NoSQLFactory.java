package com.db.abstractfactory;

public class NoSQLFactory implements AbstractFactory<CursosRepository> {

	@Override
	public CursosRepository createRepositoryAlumnos(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CursosRepository createRepositoryCursos(String type) {
		
		if("CursosNoSQL".equals(type)) {
			return new CursosNoSQLRepository();
		}else if("CursoRelacional".equals(type)) {
			return new CursoRelacionalRepository();
		}
		return null;
	}

}
