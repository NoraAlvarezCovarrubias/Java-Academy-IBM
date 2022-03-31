package com.db.abstractfactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlumnosNoSqlRepository implements AlumnosRepository {

	@Override
	public List<String> listaAlumnos() {
		List<String> alumnos= new ArrayList<>();
		Collections.addAll(alumnos, "Pedro, Ana, Pablo");
		return alumnos;
	}

}
