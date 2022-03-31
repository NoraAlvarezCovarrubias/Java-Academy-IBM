package com.card.abstractfactory;

public interface AbstractFactory<T> {
	T create(String type);
}
