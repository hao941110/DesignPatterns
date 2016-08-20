package com.hustzh.patterns.factory;

public class ShapeFactoryDemo {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		
		Shape shape1 = sf.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2 = sf.getShape("SQUARE");
		shape2.draw();
		
		Shape shape3 = sf.getShape("RECTANGLE");
		shape3.draw();

	}

}
