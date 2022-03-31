package com.db.abstractfactory;

public class RelacionalFactory implements AbstractFactory<AlumnosRepository> {

	@Override
	public AlumnosRepository createRepositoryAlumnos(String type) {
		if("AlumnosNoSql".equals(type)) {
			return new AlumnosNoSqlRepository();
		}else if("AlumnosRelacional".equals(type)) {
			return new AlumnosRelacionalRepository();
		}
		return null;
	}

	@Override
	public AlumnosRepository createRepositoryCursos(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}
