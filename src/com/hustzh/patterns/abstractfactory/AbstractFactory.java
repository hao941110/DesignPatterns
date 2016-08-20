package com.hustzh.patterns.abstractfactory;

public abstract class AbstractFactory {
	public abstract Shape getShape(String color);
	public abstract Color getColor(String color);
}
