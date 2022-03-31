package com.db.abstractfactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CursoRelacionalRepository implements CursosRepository {

	@Override
	public List<String> listaCursos() {
		List<String> cursos= new ArrayList<>();
		Collections.addAll(cursos, "MySQL","Oracle+", "Postgres");
		return cursos;
	}
	
	String getCardNumber() {
		return "000 111 222";
		
	}
	
	String getCardType() {
		return "Visa";
	}

}
