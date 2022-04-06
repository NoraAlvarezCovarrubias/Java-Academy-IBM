package com.estructurales.composite.challenge;

import java.util.ArrayList;
import java.util.List;

import com.estructurales.composite.AccountComponent;

public class GrupoDeImagenes implements Grafico{

	private List<Grafico> childGrafico;
	
	public GrupoDeImagenes() {
		this.childGrafico= new ArrayList<>();
	}


	@Override
	public void pintar() {
		for(Grafico graf: this.childGrafico) {
			graf.pintar();
		}	
	}
	
	public void addGrafico(Grafico grafico){
		this.childGrafico.add(grafico);
	}
	
	public void removeGrafico(Grafico grafico){
		this.childGrafico.remove(grafico);
	}

}
