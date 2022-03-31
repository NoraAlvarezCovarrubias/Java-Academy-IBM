package com.db.abstractfactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CursosNoSQLRepository implements CursosRepository {

	@Override
	public List<String> listaCursos() {
		List<String> cursos= new ArrayList<>();
		Collections.addAll(cursos, "Java","C++", "Phyton");
		return cursos;
	}

}
