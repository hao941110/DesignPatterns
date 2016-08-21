package com.hustzh.patterns.AbstractFactory;

public abstract class AbstractFactory {
	public abstract Shape getShape(String color);
	public abstract Color getColor(String color);
}
